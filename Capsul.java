package org.technoelevate.fundamentals;

public class Capsul {
private String name;
private int age;
private String pename;

 Capsul (String name,int age,String pename){
	 this.name=name;
	 this. age=age;
	 this.pename=pename;
		 
 }
	public String getname(){
		return name;
	}
	public int getage() {
		return age;
	}
	public String getpename() {
		return pename;
	}
	public void setname(String name) {
	this.name=name;
	System.out.println("name:" +name);
	}
     public void setpename(String penname) {
     this.pename=penname;
     System.out.println("penname:" +name);
     }
     public void setage(int age) {
         this.age=age;
         System.out.println("age:" +age);
     }
} 


