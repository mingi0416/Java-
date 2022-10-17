package com.human.ex20221017;

//Television 클래스
public class GoodTelevision extends Television implements Searchable{ //리모트컨트롤, 서치 가능
	
	int smartModuleCount;
	
	GoodTelevision(String brand, int inch, int smartModuleCount) {
		super(brand, inch);
		this.smartModuleCount = smartModuleCount;
	}

	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		System.out.println("굿 TV " + keyword + " 키워드로 검색합니다.");
	}

	
}
