package main;

import java.util.ArrayList;

public class Pokemon {
	private String Name;
	private String Type1, Type2;
	private ArrayList<String>Abi;
	private int HP, Atk, Def, SpAtk, SpDef, Spd;
	private ArrayList<String>nextEv;
	private ArrayList<String>Moves;
	
	
	
	public Pokemon() {
		
	}
	
	
	
	public Pokemon(String name, String type1, String type2, ArrayList<String> abi, int hP, int atk, int def, int spAtk,
			int spDef, int spd, ArrayList<String> nextEv, ArrayList<String> moves) {
		//super();
		Name = name;
		Type1 = type1;
		Type2 = type2;
		Abi = abi;
		HP = hP;
		Atk = atk;
		Def = def;
		SpAtk = spAtk;
		SpDef = spDef;
		Spd = spd;
		this.nextEv = nextEv;
		Moves = moves;
	}



	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType1() {
		return Type1;
	}
	public void setType1(String type1) {
		Type1 = type1;
	}
	public String getType2() {
		return Type2;
	}
	public void setType2(String type2) {
		Type2 = type2;
	}
	public ArrayList<String> getAbi() {
		return Abi;
	}
	public void setAbi(ArrayList<String> abi) {
		Abi = abi;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getAtk() {
		return Atk;
	}
	public void setAtk(int atk) {
		Atk = atk;
	}
	public int getDef() {
		return Def;
	}
	public void setDef(int def) {
		Def = def;
	}
	public int getSpAtk() {
		return SpAtk;
	}
	public void setSpAtk(int spAtk) {
		SpAtk = spAtk;
	}
	public int getSpDef() {
		return SpDef;
	}
	public void setSpDef(int spDef) {
		SpDef = spDef;
	}
	public int getSpd() {
		return Spd;
	}
	public void setSpd(int spd) {
		Spd = spd;
	}
	public ArrayList<String> getNextEv() {
		return nextEv;
	}
	public void setNextEv(ArrayList<String> nextEv) {
		this.nextEv = nextEv;
	}
	public ArrayList<String> getMoves() {
		return Moves;
	}
	public void setMoves(ArrayList<String> moves) {
		Moves = moves;
	}



	//@Override
//	public String toString() {
//		return "Pokemon [Name=" + Name + ", Type1=" + Type1 + ", Type2=" + Type2 + ", Abi=" + Abi + ", HP=" + HP
//				+ ", Atk=" + Atk + ", Def=" + Def + ", SpAtk=" + SpAtk + ", SpDef=" + SpDef + ", Spd=" + Spd
//				+ ", nextEv=" + nextEv + ", Moves=" + Moves + "]";
//	}
	
	
}
