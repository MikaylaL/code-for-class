package Unit4;

public class Dog {
	//data fields (name, breed, type, age)
	private String name;
	private String breed;
	private String size;
	private int age;
	// Constructor
	//Default Constructor
	public Dog() {
		name = "unknown";
		breed =  "unknown_breed";
		size = "unknown_size";
		age = 0;
		System.out.println("The default constructor is called.");
	}
	//Overloaded Constructor
	public Dog(String dog_name, String dog_breed, String dog_size, int dog_age) {
		name = dog_name;
		breed = dog_breed;
		size = dog_size;
		age = dog_age;
		System.out.println("The overloaded constructor is called.");

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
	public String getSize() {
		return size;
	}
	//setters
	public void setName(String dog_name) {
		name = dog_name;
	}
	public void setBreed(String dog_breed) {
		breed = dog_breed;
	}
	public void setSize(String dog_size) {
		size = dog_size;
	}
	public void setAge(int dog_age) {
		if (dog_age > 0) {
			age = dog_age;
		} else {
			System.out.println("Please pass a value greater than 0.");
		}
	}
	
	//methods
	public void bark() {
		System.out.println("Woof");
	}
}
