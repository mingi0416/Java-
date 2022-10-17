package com.human.ex20221014;

public class OrcMain {

	public static void main(String[] args) {
		/* 1. Orc 객체를    만들고    정보를    출력하시오. */
		Orc orc1 = new Orc("오크", 80);
		Orc orc2 = new Orc("오크", 80);
		
		
		
//		System.out.println(orc1.toString());
		/* 2. OrcWarrior 객체를    만들고    정보를    출력하시오. */
		OrcWarrior orcW1 = new OrcWarrior("오크전사", 120, 3);
		OrcWarrior orcW2 = new OrcWarrior("오크전사", 120, 3);
		
		Orc[] orcs = {orc1, orc2, orcW1, orcW2};
		
		for(Orc o : orcs) {
			System.out.println(o.toString());
		}
		
//		System.out.println(orcW.toString());
//		System.out.println(orc1.toString());
//		System.out.println(orc2.toString());
//		System.out.println(orcW1.toString());
//		System.out.println(orcW2.toString());
		
	}
}

//오크는 오크워리어인가? No 
//오크워리어는 오크인가? Okay
class Orc {
	protected String name; 
	protected int hp;
	//				  "오크", 80
	public Orc(String name, int hp) { 
		this.name = name;
		this.hp = hp; 
	}
	public String toString() { 
		return String.format("Orc { hp : %d , name : %s }", hp, name);
	} 
}
class OrcWarrior extends Orc { 
	protected int amor;
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor; 
	}
	// 메소드    오버라이딩! 
	public String toString() { 
		return String.format("OrcWarrior { hp : %d , name : %s , amor : %d}", hp, name, amor);
	}
} 
