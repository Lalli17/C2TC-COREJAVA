package superkeyword;
class Animall{
	Animall(){
		System.out.println("Animal Constructor");
	}
}
class Dogg extends Animall{
	Dogg(){
		super();
		System.out.println("Dog Constructor");
	}
}
public class Constructor {

	public static void main(String args[]) {
		
		Dogg d=new Dogg();
	}
}
