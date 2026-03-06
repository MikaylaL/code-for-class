package Unit4;

public class TestDog {
	public static void main (String[] args) {
		Dog dog1 = new Dog();
		Dog tian = new Dog("TianTian", "Peka-tese", "Small", 5);
		Dog apple = new Dog();
		apple.setName("Apple");
		apple.setBreed("Husky");
		apple.setAge(3);
		apple.setSize("Large");
		System.out.print("\n");
		tian.bark();
		//have to do it like this cus its private
		System.out.println("\nName: "+ dog1.getName() + ", breed: " + dog1.getBreed() + ", size: " + dog1.getSize() + ", age: " + dog1.getAge());
		System.out.println("Name: "+ tian.getName() + ", breed: " + tian.getBreed() + ", size: " + tian.getSize() + ", age: " + tian.getAge());
		System.out.println("Name: "+ apple.getName() + ", breed: " + apple.getBreed() + ", size: " + apple.getSize() + ", age: " + apple.getAge());
		fight(apple, tian);
	}
	
	public static void fight(Dog dog1, Dog dog2) {
		if (dog1.getAge() > dog2.getAge()) {
			System.out.println(dog1.getName() + " wins!");
		} else if (dog1.getAge() == dog2.getAge()) {
			System.out.println("It's a tie.");
		} else {
			System.out.println(dog2.getName() + " wins!");

		}
	}
}