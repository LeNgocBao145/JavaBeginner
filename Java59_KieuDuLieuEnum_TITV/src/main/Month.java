package main;

public enum Month {
	January(31),
	Febuary(29),
	Match(31),
	April(30),
	May(31),
	June(30),
	July(31),
	August(31),
	September(30),
	October(31),
	November(30),
	December(31);
	
	private final int soNgay;

	Month(int soNgay){
		this.soNgay = soNgay;
	}
	
	public int soNgay()
	{
		return soNgay;
	}
}
