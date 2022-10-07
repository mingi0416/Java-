package com.human.ex20221006;

public class class_publicToDo {
	private int time;
	   private String todo;
	   
	   class_publicToDo(String todo, int time) {
	      this.time = time;
	      this.todo = todo;
	   }
	   
	   public String info() {
	      return time+todo;
	   }
}
