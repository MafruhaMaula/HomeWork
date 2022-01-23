package hw5Q2Constructor;

public class Computer {
	
	public String brand; // Variables are declared
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	
	
	public Computer() {
		
		System.out.println("This is from default Constructor of Computer class:-");
		
	}

    public Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeInUSA)  {
    	
    	this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + ", Model: " + model+", Operating System: " + operatingsystem + ", Price: " + price + ", Grade: " + grade + ", Made in USA? Ans:" + madeInUSA); 
	}
    	
    }
	

