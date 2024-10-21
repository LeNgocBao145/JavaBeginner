package main;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
		PokeList listPoke = new PokeList();
		String fileName = "C:\\Users\\DELL\\Documents\\JavaBeginner\\Hard_PracticeReadFile\\src\\main\\pokemon.csv";
		listPoke.readFile(fileName);
		listPoke.print();
	}
}
