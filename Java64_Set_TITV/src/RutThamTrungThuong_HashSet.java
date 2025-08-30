import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	private Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	public boolean themPhieu(String val) {
		return this.thungPhieuDuThuong.add(val);
	}
	
	public boolean xoaPhieu(String val) {
		return this.thungPhieuDuThuong.remove(val);
	}
	
	public boolean kiemTraPhieuTonTai(String val) {
		return this.thungPhieuDuThuong.contains(val);
	}
	
	public void xoaTatCaPhieu() {
		this.thungPhieuDuThuong.clear();
	}
	
	public int soLuongPhieu() {
		return this.thungPhieuDuThuong.size();
	}
	
	public String rutThamTrungThuong() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.soLuongPhieu());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inTatCa() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	
	public static void main(String[] args) {
		int luaChon = 0;
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("================================");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng");
			System.out.println("2. Xóa mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất phiếu dự thưởng");
			System.out.println("5. Số lượng phiếu dự thưởng");
			System.out.println("6. Rút thăm trúng thưởng");
			System.out.println("7. In tất cả phiếu");
			System.out.println("0. Thoát");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch(luaChon){
				case 1, 2, 3:
					System.out.println("Nhập vào mã phiếu dự thưởng: ");
					String giaTri = sc.nextLine();
					if(luaChon == 1) {
						rt.themPhieu(giaTri);
					}else if(luaChon == 2) {
						rt.xoaPhieu(giaTri);
					}else {
						System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
					}
					break;
				case 4, 5, 6, 7:
					if(luaChon == 4) {
						rt.xoaTatCaPhieu();
					}else if(luaChon == 5) {
						System.out.println("Số lượng phiếu " + rt.soLuongPhieu());
					}else if(luaChon == 7) {
						rt.inTatCa();
					}
					else {
						System.out.println("Phiếu: " + rt.rutThamTrungThuong());
					}
				break;
			}
		}while(luaChon != 0);
		sc.close();
	}
}
