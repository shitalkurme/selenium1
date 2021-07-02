package Pkg2;

import Pkg1.Shital;

public class Pqr extends Abc {
			
	public static void main (String[]args) {
		Abc a= new Abc();
		a.display();	
			
		}
		void display() {
			System.out.println(super.name);
			System.out.println(super.address);
			
	}

}
