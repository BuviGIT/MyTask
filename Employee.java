package org.git;

public class Employee {
	
	public void clientA() {
		System.out.println("Client A is TCS");
	}
	
	
	public void clientB() {
		System.out.println("ClientA is CTS");
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.clientA();
		e.clientB();
		
		
	}

}
