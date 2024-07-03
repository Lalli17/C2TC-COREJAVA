package superkeyword;
class Animal{
	
	String color="Brown";
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	String color="White";
	void eat()
	{
		System.out.println("Eating meat");
	}
	void call() {
		System.out.println(color);//white since it depends on local variable
		System.out.println(super.color);//Brown bcs its referred to animal
		super.eat();
	}
}

public class Variable {
	public static void main(String args[]) {
		//super keyword cannot be used in a static method
		Dog d= new Dog();
		System.out.println(d.color);
		Animal a= new Dog();
		System.out.println(a.color);
		d.call();
		d.eat();
	}

}
