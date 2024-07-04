package abstractkeyword;
//Abstract class
public abstract class Bike {
Bike(){
	System.out.println("Bike constructor");
}
	
	//non abstract method , abstract and static cannot be together
	static void speed() {
		
	}
	
	abstract void run();
	{
		
	}
}
//Concrete class
//abstract class is extended and being implemented
class R15 extends Bike{
	
	R15(){
		System.out.println("R15 constructor");
	}
	void run() {
		
	}
}