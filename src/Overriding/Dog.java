package Overriding;

class Dog extends Animal {
	@Override
	public void displayInfo() {
		//super.displayInfo();
		System.out.println("I am a dog.");
	}
}
