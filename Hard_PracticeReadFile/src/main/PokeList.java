package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PokeList {
	private ArrayList<Pokemon> pokeList;
	
	
	
	public PokeList() {
		this.pokeList = new ArrayList<Pokemon>();
	}

	public PokeList(ArrayList<Pokemon> pokeList) {
		this.pokeList = pokeList;
	}

	public void readFile(String fileName) throws IOException
	{
		File f = new File(fileName);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		if(!f.exists())
		{
			System.out.println("Create New File!");
			f.createNewFile();
		}
		
		String trash = br.readLine();
		
		while(true)
		{
			Pokemon newPok = new Pokemon();
			String line = br.readLine();
			if(line == null) break;
			String[] buff = line.split("[,]");
			
			for (String str : buff) {
				System.out.println(str);
			}
			
			newPok.setName(buff[0]);
			String[] tmp1 = buff[1].split("[\\[;\"\\]]+");
			ArrayList<String> arr0 = new ArrayList<String>(Arrays.asList(tmp1));
			//arr3.remove("\\s+");
			arr0.removeIf(String::isBlank);
			
			//String[] tmp1 = buff[1].split(" ");
			System.out.println(tmp1.length);
			newPok.setType1(arr0.get(0));
			if(arr0.size() > 1)
			{
				newPok.setType2(arr0.get(1));
			}
			else {
				newPok.setType2(" ");
			}
			
			String[] tmp2 = buff[2].split("[\\[;\"\\]]+");
			//String[] tmp2 = buff[2].split(" ");
			ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(tmp2));
			arr1.removeIf(String::isBlank);
			newPok.setAbi(arr1);
			
			newPok.setHP(Integer.parseInt(buff[3]));
			newPok.setAtk(Integer.parseInt(buff[4]));
			newPok.setDef(Integer.parseInt(buff[5]));
			newPok.setSpAtk(Integer.parseInt(buff[6]));
			newPok.setSpDef(Integer.parseInt(buff[7]));
			newPok.setSpd(Integer.parseInt(buff[8]));
			
			String[] tmp3 = buff[9].split("[\\[;\"\\]]+");
			//String[] tmp3 = buff[9].split(" ");
			ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(tmp3));
			//arr3.remove("\\s+");
			arr2.removeIf(String::isBlank);
			newPok.setNextEv(arr2);
			//newPok.setNextEv(new ArrayList<String>(Arrays.asList(tmp3)));
			
			String[] tmp4 = buff[10].split("[\\[;\"\\]]+");
			//String[] tmp4 = buff[10].split(" ");
			ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList(tmp4));
			//arr3.remove("\\s+");
			arr3.removeIf(String::isBlank);
			newPok.setMoves(arr3);
			pokeList.add(newPok);
		}
		
		fr.close();
		br.close();
		
	}
	
	public void print()
	{
		for(int i = 0; i < pokeList.size(); i++)
		{
			System.out.println("Name: " + pokeList.get(i).getName());
			System.out.println("Type 1: " + pokeList.get(i).getType1());
			System.out.println("Type 2: " + pokeList.get(i).getType2());
			System.out.print("Abilities: ");
			for (String abi : pokeList.get(i).getAbi()) {
				System.out.print(abi + " - ");
			}
			System.out.print("\n\n");
			
			System.out.printf("HP: %d\nAttack: %d\nDefense: %d\nSpeed Attack: %d\nSpeed Defense: %d\nSpeed: %d\n", pokeList.get(i).getHP(), pokeList.get(i).getAtk(), pokeList.get(i).getDef(), pokeList.get(i).getSpAtk(), pokeList.get(i).getSpDef(), pokeList.get(i).getSpd());
			System.out.print("\n");
			System.out.print("Next Evolutions: ");
			for (String nextEv : pokeList.get(i).getNextEv()) {
				System.out.print(nextEv + " - ");
			}
			
			System.out.print("\n\n");
			
			System.out.print("Moves: ");
			for (String mov : pokeList.get(i).getMoves()) {
				System.out.print(mov + " - ");
			}
			
			System.out.print("\n\n");
		}
	}
}
