import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Ex {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java73_Luu_Object_vao_file_TITV\\file.data");
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien st = new SinhVien("001", "TITV", 2000, 10);
			oos.writeObject(st);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
