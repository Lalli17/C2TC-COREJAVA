package types_of_inheritance;
class Animal{
	
	void eat() {
		
	}
}
class Dog extends Animal{
	void bark() {
		
	}
}
public class SingleInheritance {

	public static void main(String args[]) {
		
		Animal a=new Animal();
		a.eat();//can access only animal
		
		Dog d= new Dog();
		d.eat();
		d.bark();//can access both animal and dog methods
		
		Animal a1=new Dog();// can access only animal method
		a1.eat();
		
	}
}
