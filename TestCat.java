/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* Lab 3
****************************************************************
*********/
package Unit4;

public class TestCat {
	public static void main (String[] args) {
		// my cat called with overloaded constructor
		Cat mauve = new Cat("Mauve", "Calico", 5, false);
		//cat called with default constructor
		Cat cat1 = new Cat();
		System.out.println("Number of Cat Objects Created: " + Cat.getNumOfCats());
		//prints out the characteristics of both objects
		System.out.println(mauve.toString());
		System.out.println(cat1.toString());
		//makes each cat meow
		mauve.talk();
		cat1.talk();
	}
}

class Cat {
	private String name;
	private String breed;
	private int age;
	private boolean isMale;
	private static int numOfCats = 0;
	
	//Default Constructor
	public Cat() {
		name = "Unknown";
		breed =  "Mixed";
		age = 0;
		isMale = true;
		numOfCats++;
		// used for testing purposes
		// System.out.println("The default constructor is called.");
	}
	
	//Overloaded Constructor
	public Cat(String cat_name, String cat_breed, int cat_age, boolean cat_male) {
		name = cat_name;
		breed = cat_breed;
		age = cat_age;
		isMale = cat_male;
		numOfCats++;
		//used for testing purposes
		// System.out.println("The overloaded constructor is called.");
	}
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public static int getNumOfCats() {
		return numOfCats;
	}
	//setters
	public void setName(String cat_name) {
		name = cat_name;
	}
	public void setBreed(String cat_breed) {
		breed = cat_breed;
	}
	public void setIsMale(boolean cat_male) {
		isMale = cat_male;
	}
	public void setAge(int dog_age) {
		age = dog_age;
	}
	
	//methods
	public void talk() {
		System.out.println("Meow!");
	}
	
	public String toString() {
		String s = "Cat [Name = " + name + ", Age = " + age + ", Breed = " + breed + ", IsMale = " + isMale + "]";
		return s;
		}
}
			
