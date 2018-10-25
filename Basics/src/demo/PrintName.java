package demo;

public class PrintName {
	
	 String name;
	 int age;
	 String gender;
	
	
	public PrintName(String personName, int personAge, String personGender){
		name = personName;
		age = personAge;
		gender = personGender;
	}
	
	public void printPersonDetails(PrintName x){
		System.out.println("Name of the person = " + x.name );
		System.out.println("Age of the person = " + x.age);
		System.out.println("Gender of the person = " + x.gender);
	}
	
	public static PrintName getPersonDetails(PrintName person){
		person.name = "Krishna";
		return person;
		
	}

	

}
