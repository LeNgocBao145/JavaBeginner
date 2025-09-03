import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Ex {
	public static void copyAll(File f1, File f2) {
		try {
	        if (f1.isDirectory()) {
	            // Nếu là thư mục thì tạo thư mục đích (nếu chưa có)
	            if (!f2.exists()) {
	                f2.mkdirs();
	            }

	            File[] listF = f1.listFiles();
	            if (listF != null) {
	                for (File file : listF) {
	                    File targetFile = new File(f2, file.getName());
	                    copyAll(file, targetFile);
	                }
	            }
	        } else {
	            // Nếu là file thì mới copy
	            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		File f0 = new File("file2.txt");
		File f1 = new File("file3.txt");
		
		// Sử dụng method renameTo của class File để thay đổi tên hoặc di chuyển 
		// file hoặc thư mục
//		f0.renameTo(f1); 
		
		// Sử dụng method move của class Files để thay đổi tên hoặc di chuyển 
		// file hoặc thư mục
		try {
			Files.move(f0.toPath(), f1.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Lưu ý: method copy của Files chỉ copy thư mục rỗng không copy được hết
		// các thư mục con hay file con nằm trong thư mục
		
//		Files.copy() không cho phép ghi đè thư mục không rỗng và sẽ ném DirectoryNotEmptyException
//		REPLACE_EXISTING chỉ hoạt động tốt với file hoặc thư mục rỗng, chứ không thể ghi đè một thư mục không rỗng.
		File c0 = new File("c0");
		File c0_new = new File("c0_new");
//		try {
//			Files.copy(c0.toPath(), c0_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		copyAll(c0, c0_new);
		
	}

}
