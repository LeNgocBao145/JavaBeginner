package main;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileEx {
	File f;

	public FileEx(String fileName) {
		this.f = new File(fileName);
	}

	public boolean checkExecute() {
		return this.f.canExecute();
	}
	
	public boolean checkRead() {
		return this.f.canRead();
	}
	
	public boolean checkWrite() {
		return this.f.canWrite();
	}
	
	public void printFilePath() {
		System.out.println("File path: " + this.f.getAbsoluteFile());
	}
	
	public void printFileName() {
		System.out.println("File name: " + this.f.getName());
	}
	
	public void checkFileOrDirectory() {
		String res = "";
		if (this.f.isDirectory()) {
			res = "Directory";
		}
		
		if (this.f.isFile()) {
			res = "File";
		}
		
		System.out.println(res);
		return;
	}
	
	public void printAllSubFiles() {
		if(f.isFile()) {
			System.out.println("There are no sub files");
			return;
		}else {	
			File[] listFile = f.listFiles();
			for(int i = 0; i < listFile.length; i++) {
				if(!listFile[i].isDirectory()) {
					System.out.println(listFile[i].getName());
				}
			}
		}
		
	}
	
	private void printFileTree(File f, int stage) {
		if(f.isFile()) {
			System.out.println(f.getName());
			return;
		}
		String indent = "";
		for(int i = 0; i < stage; i++) {
			indent += "  ";
		}
		if(stage == 0) {			
			System.out.println(f.getName());
		}
		File[] listFile = f.listFiles();
		for(int i = 0; i < listFile.length; i++) {
			if(listFile[i].isDirectory()) {
				System.out.println(indent + "|_" + listFile[i].getName());
				printFileTree(listFile[i], stage + 1);
			}else {
				System.out.println(indent + "|_" + listFile[i].getName());
			}
		}
	}
	
	public void printDirectoryTree() {
		this.printFileTree(this.f, 0);
	}

	public static void main(String[] args) {
		String fileName = "";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Input file name: ");
		fileName = sc.nextLine();
		FileEx exf = new FileEx(fileName);
		do {
			System.out.println("===========MENU========="
					+ "\n1. Kiểm tra file có thể thực thi"
					+ "\n2. Kiểm tra file có thể đọc"
					+ "\n3. Kiểm tra file có thể ghi"
					+ "\n4. In đường dẫn"
					+ "\n5. In tên file"
					+ "\n6. Kiểm tra file là thư mục hoặc tập tin"
					+ "\n7. In danh sách các file con"
					+ "\n8. In ra cây thư mục"
					+ "\n0. Thoát");	
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Check execute: " + exf.checkExecute());
				break;
			case 2:
				System.out.println("Check read: " + exf.checkRead());
				break;
			case 3:
				System.out.println("Check write: " + exf.checkWrite());
				break;
			case 4:
				exf.printFilePath();
				break;
			case 5:
				exf.printFileName();
				break;
			case 6:
				exf.checkFileOrDirectory();
				break;
			case 7:
				exf.printAllSubFiles();
				break;
			case 8:
				exf.printDirectoryTree();
				break;
			}
		}while(choice != 0);
		sc.close();
	}

}
