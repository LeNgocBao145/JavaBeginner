package main;

public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		//super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getTen()
	{
		String s = hoVaTen.trim();
		if(s.indexOf(" ") >= 0) {
			int pos = s.lastIndexOf(" ");
			return s.substring(pos + 1);
		}else {
			return s;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		// <0
		// =0
		// >0
		// Base on name
		// name: Adam, Barcack Obama, Nguyen Van A, Tran Thi Thanh Yen
		String tenThis = this.getTen();
		String ten0 = o.getTen();
		double gpaThis = this.getDiemTrungBinh();
		double gpaO = o.getDiemTrungBinh();
		return tenThis.compareTo(ten0);
	}
	
	
}
