package org.technoelevate.fundamentals;

public class FirstProject {
	String name;
	int number; 
	int age;
	FirstProject ( String name,int number){
		
		this.name=name;
		this.number=number;
	 }
	FirstProject  (String name,int number,int age){
		 
		 this.name=name;
		 this.number=number;
		 this.age=age;
	}
	void display() {
	System.out.println(name+" "+number+" "+age);
	}
     public static void main(String[] args) {
    	 
      FirstProject f = new FirstProject("madhu",49);
      FirstProject f1 = new FirstProject("sappu",50,60);
      f.display();
      f1.display();
     }
     
}
