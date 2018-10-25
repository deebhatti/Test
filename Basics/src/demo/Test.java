package demo;

public class Test {
	
	public static void main(String[] args) {
		PrintName person3 = new PrintName("Mohan",25,"Male");
		person3.printPersonDetails(person3);
		
		
		
		
		
		
		PrintName modifiedObject = PrintName.getPersonDetails(person3);
		
		
		
		System.out.println("Name of the person= " + modifiedObject.name);
		System.out.println("Name of the person= " + modifiedObject.age);
		System.out.println("Name of the person= " + modifiedObject.gender);
		
	}

}
