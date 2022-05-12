package com.chainsys.introduction;

public class Bike {
	
		  void run(){System.out.println("running");}  
		}  
		class Splendor extends Bike{  
		  void run(){System.out.println("running safely with 60km");}  
		  
		  public static void main(String args[]){  
		    Bike b = new Splendor();
		    b.run();  
		  }  
		}  


		class Main {
		    int age;
		    Main(int age){
		        this.age = age;
		    }

		    public static void main(String[] args) {
		        Main a1= new Main(8);
		        System.out.println("a1.age = " + a1.age);
		    }
		}
