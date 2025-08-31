import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class main {
	public void deleteDirWithFiles(File d) {
		if(d.isFile()) {
			System.out.println("Delete file " + d.getName() + ": " + d.delete());
		}else if(d.isDirectory()) {
			File[] listFiles = d.listFiles();
			for(File f : listFiles) {
				deleteDirWithFiles(f);
			}
			System.out.println("Delete directory " + d.getName() + ": " + d.delete());
		}
	}
	
	public void deleteDirWithFiles(Path p) {
		File d = p.toFile();
		if(d.isFile()) {
			System.out.println("Delete file " + d.getName() + ": " + d.delete());
		}else if(d.isDirectory()) {
			File[] listFiles = d.listFiles();
			for(File f : listFiles) {
				deleteDirWithFiles(f);
			}
			System.out.println("Delete directory " + d.getName() + ": " + d.delete());
		}
	}

	public static void main(String[] args) {
		//Sử dụng class File
		File f = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java69_Xoa_file_va_thu_muc_TITV\\src\\file.txt");
		File f0 = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java69_Xoa_file_va_thu_muc_TITV\\src\\f0");
		File f0_1 = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java69_Xoa_file_va_thu_muc_TITV\\src\\f0_1");
		
		//Lưu ý:
		//Chỉ xóa được thư mục rỗng
		
//		System.out.println(f.delete());
//		f0.deleteOnExit();
//		main m = new main();
//		m.deleteDirWithFiles(f0);
		
		//Sử dụng class Files
		try {
			Files.deleteIfExists(f.toPath());
			main m = new main();
			m.deleteDirWithFiles(f0.toPath());
			Files.deleteIfExists(f0_1.toPath());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
