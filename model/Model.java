package com.human.model;
//1. MVC 패턴을 만들 때 많은 메소드들이 사용되는데 동일한 모양으로
//메소드를 호출해서 데이터를 주고 받기 위해서 
//map을 이용한 Model 클래스를 작성한다.

import java.util.HashMap;

//a(int) a(ArrayList) a(name, height)
//a(Model)

//Model map + 추가기능들

public class Model {
	private HashMap<String, Object> hashmap = new HashMap<String, Object>();
		
	public void setAttribute(String key, Object value) {
		hashmap.put(key, value);
	}
	public Object getAttribute(String key) {
		return hashmap.get(key);
	}
	public void removeAttribute(String key) {
		hashmap.remove(key);
	}
}
