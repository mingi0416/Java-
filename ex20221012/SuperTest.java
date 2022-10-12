package com.human.ex20221012;

public class SuperTest {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		return "";
	}
}

class OrcWarrior {
	protected int amor;
	public OrcWarrior(String name, int hp, int amor) {
		this.amor = amor;
		super(name, hp);
	}

// 메소드 오버라이딩!
	public String toString() {
		return "";
	}
}