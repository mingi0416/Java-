package com.human.ex20221006;

public class class_privateToDo {
	  private int time;
	   private String todo;
	   
	   class_privateToDo(String todo, int time) {
	      this.time = time;
	      this.todo = todo;
	   }
	   
	   public String info() {
	      return time+todo;
	   }

}
