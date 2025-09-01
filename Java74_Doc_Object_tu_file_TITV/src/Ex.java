import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;


public class Ex {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java73_Luu_Object_vao_file_TITV\\file.data");
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			//Lưu ý:
//			Class của object được đọc từ file phải nằm trong package với tên 
//			trùng tên với package sử dụng phương thức readObject (tức tên package hiện tại
//			phải trùng với tên package chứa class của obj lúc object được ghi vào file)
			SinhVien st = (SinhVien) ois.readObject();
			System.out.println(st);
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
