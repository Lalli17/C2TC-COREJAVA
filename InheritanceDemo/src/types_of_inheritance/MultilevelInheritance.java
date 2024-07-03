package types_of_inheritance;

class Animall{
	void eat() {
		
	}
}
class Dogg extends Animall{
	void bark() {
		
	}
}
class puppy extends Dogg{
	void weep() {
		
	}
}

public class MultilevelInheritance {

	public static void name(String args[]) {
		Animall a =new Animall();
		a.eat();//access only animal
		
		Dogg d=new Dogg();//access both animal and dog
		d.eat();
		d.bark();
		
		puppy p =new puppy();//access all 3
		p.eat();
		p.bark();
		p.weep();
		
		Animall a1=new Dogg();
		Animall a2=new puppy();
		Dogg d1=new puppy();
		
	}
}
