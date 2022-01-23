package hw4Q2JavaVariables;

public class AboutMe {
	
	public String name0;     // variable is declared
	public String name = "Mafruha Maula";//variable is initialized
	public byte age = 100;
	public short myYearlyHouseRent = 4500;
	public long myBankBalance = 40000000;
	public float myHeight = 6.5300f;
	public double myGrade = 4.0000;
	public char sex = 'F';
	public boolean usCitizen = true;
	
	
	// Constructor declared 
	public AboutMe() {
		System.out.println("This is all about me:-");
		
		
	}
	
	//method is implemented
	public void aboutMe() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nYearlyHouseRent: " + myYearlyHouseRent + "\nMy Bank Balance is: " + myBankBalance + "\nMy Height is: " + myHeight + "\nMy Grade is: " + myGrade + "\nSex: " + sex + "\nAm I US Citizen? Ans: " + usCitizen);
	}
		
	}
	
