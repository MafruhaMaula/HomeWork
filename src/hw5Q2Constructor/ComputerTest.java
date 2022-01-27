package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer1 = new Computer(); //Default constructor initialized
		Computer computer2 = new Computer("Apple", "MacBookAir", "MacOS Mojave", 800, 'A', false); // Parameterized constructor initialized
		Computer computer3 = new Computer("Windows", "Hp", "Windows 10", 1200, 'A', false);

	}

}
