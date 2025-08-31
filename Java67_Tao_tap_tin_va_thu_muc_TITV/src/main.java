import java.io.File;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		// Lưu ý:
		// Windows: \ => \\ Ví dụ: "C:\\Users\\DELL\\Downsloads"
		File folder1 = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java67_Tao_tap_tin_va_thu_muc_TITV");
		
		// Kiểm tra thư mục hoặc tập tin có tồn tại hay không
		System.out.println("folder1 có tồn tại hay không: " + folder1.exists());
		
		// Tạo thư mục
		// Phương thức mkdir() => tạo 1 thư mục
		File folder2 = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java67_Tao_tap_tin_va_thu_muc_TITV\\Dir1");
		folder2.mkdir();
		
		// Phương thức mkdirs() => tạo nhiều thư mục cùng lúc
		File folder3 = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java67_Tao_tap_tin_va_thu_muc_TITV\\src\\Dir1\\Dir2\\Dir3");
		folder3.mkdirs();
		
		// Tạo tập tin có phần mở rộng(extension): .exe, .docx, .pdf....
		// Phương thức mkdir()
		File file1 = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java67_Tao_tap_tin_va_thu_muc_TITV\\src\\Dir1\\Dir2\\lol.java");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
