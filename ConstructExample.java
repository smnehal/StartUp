package com.garmin.examples;

public class ConstructExample {

	String web;
	ConstructExample(String w){
		web = w ;
	}
	ConstructExample(ConstructExample ce){
		web = ce.web;
	}
	void display(){
		System.out.println("Webiste "+web);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructExample Obj = new ConstructExample("my Boot");
		ConstructExample Obj2 = new ConstructExample(Obj);
		ConstructExample Obj3 = new ConstructExample(Obj2);
		Obj.display();
		Obj2.display();
		Obj3.display();

	}

}
