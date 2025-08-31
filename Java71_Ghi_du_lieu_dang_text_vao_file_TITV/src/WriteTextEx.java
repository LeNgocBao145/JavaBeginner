import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteTextEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw;
		
		//Lưu ý sau khi kết thúc ghi file phải close() để PrintWriter 
		//tự động flush() dữ liệu vào file
		
//		pw = new PrintWriter(System.out);
//		
//		//Sử dụng đối số 2 là true để bật auto-flush
//		pw = new PrintWriter(System.out, true);
//		pw.println("Xin chào Bảo");
//		pw.close();
		
		try {
			
			pw = new PrintWriter("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java71_Ghi_du_lieu_dang_text_vao_file_TITV\\src\\file.txt", "UTF-8");
			pw.println("Xin chào Bảo");
			pw.flush();
			
			pw.print("Dữ liệu: ");
			pw.print(3.14 + " là số PI");
			pw.println();
			
//			Lưu ý:
//			Nếu bạn không override toString(), khi in/ghi ra 
//			(System.out.println(obj) hoặc pw.println(obj)), Java sẽ gọi mặc định 
//			Object.toString(). Kết quả thường là: (TênClass)@hashcodeHex
			
//			Nếu bạn override toString() trong class, thì println() hoặc write() 
//			của PrintWriter sẽ tự động sử dụng kết quả trả về của toString() để ghi.
			Student st = new Student("010", "Nguyen Van A");
			pw.print(st);
			String dumb = "\nLOL";
			pw.append(dumb, 0, 3);
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
