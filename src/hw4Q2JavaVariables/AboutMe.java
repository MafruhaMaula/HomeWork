package hw4Q2JavaVariables;

public class AboutMe {

	public String name0; // variable is declared
	public String name;// variable is initialized
	public byte age;
	public short myYearlyHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	// Constructor declared
	public AboutMe() {
		System.out.println("This is all about me:-");

	}

	// method is implemented
	public void aboutMe() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nYearlyHouseRent: " + myYearlyHouseRent
				+ ", myYearlySalary" + myYearlySalary + "\nMy Bank Balance is: " + myBankBalance + "\nMy Height is: "
				+ myHeight + "\nMy Grade is: " + myGrade + "\nSex: " + sex + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}
