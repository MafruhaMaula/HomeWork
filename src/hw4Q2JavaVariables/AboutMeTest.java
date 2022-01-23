package hw4Q2JavaVariables;

public class AboutMeTest {
	
	public static void main(String[] args) {
		// class is instantiated
		AboutMe me1= new AboutMe(); // Constructor is initialized
		me1. name = "Mafruha Maula";//variable is initialized
		me1.age = 100;
		me1.myYearlyHouseRent = 4500;
		me1.myBankBalance = 40000000;
		me1.myHeight = 6.5300f;
		me1.myGrade = 4.0000;
		me1.sex = 'F';
		me1.usCitizen = true;
		me1.aboutMe();	// method initialized
		
		
		System.out.println("\n####################\n");
		
		
		AboutMe me2 = new AboutMe();// Constructor is initialized
		me2. name = "Alex";//variable is initialized
		me2.age = 100;
		me2.myYearlyHouseRent = 6500;
		me2.myBankBalance = 70000000;
		me2.myHeight = 3.5200f;
		me2.myGrade = 3.5000;
		me2.sex = 'M';
		me2.usCitizen = true;
		me2.aboutMe();	// method initialized
		
		
		
	}
	
	
	

	
}
