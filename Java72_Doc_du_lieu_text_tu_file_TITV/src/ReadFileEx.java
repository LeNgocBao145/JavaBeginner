import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEx {

	public static void main(String[] args) {
		//Cách 1
		/*
		✅ Ưu điểm:

			Rõ ràng, ngắn gọn.

			Luôn cho phép bạn chỉ định charset → tránh lỗi tiếng Việt.

			Kết hợp tốt với try-with-resources (Java 7+).

			Đây là cách hiện đại và chuẩn nhất trong Java.

		❌ Nhược điểm:

			Chỉ dùng được từ Java 7 trở lên (nhưng bây giờ hầu như không còn vấn đề). 
		*/
		/*
		File file = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java72_Doc_du_lieu_text_tu_file_TITV\\src\\file.txt");
		try {
			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Cách 2
		/*
		Ưu điểm:

			Code ngắn gọn, dễ dùng.

			Trực tiếp có danh sách các dòng → tiện xử lý sau (lọc, map, foreach).

			Có thể chỉ định rõ charset (UTF-8).

		Nhược điểm:

			Load toàn bộ nội dung file vào bộ nhớ.

			Nếu file lớn (vài trăm MB hoặc GB) → tốn RAM, có thể gây OutOfMemoryError.
		*/
		File file = new File("C:\\Users\\DELL\\Documents\\JavaBeginner\\Java72_Doc_du_lieu_text_tu_file_TITV\\src\\file.txt");
		try {
			List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Cách 3
		/*
		BufferedReader br = new BufferedReader(new FileReader(file));
		Hoạt động: Đọc lần lượt từng dòng bằng br.readLine().

		Ưu điểm:

			Tiết kiệm bộ nhớ (chỉ giữ một dòng tại một thời điểm).

			Thích hợp cho file rất lớn.

		Nhược điểm:

			Phải tự viết vòng lặp while ((line = br.readLine()) != null) { ... }.

			Nếu muốn có toàn bộ dữ liệu, bạn phải tự gom lại (thay vì List<String> có sẵn).

			Nếu dùng new FileReader(file) thì không đảm bảo UTF-8 → có thể bị lỗi tiếng Việt.

			Nếu dùng Files.newBufferedReader(..., UTF_8) thì an toàn hơn.
		*/
	}

}
