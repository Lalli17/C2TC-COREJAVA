package statickeyword;
class Outer{
	
	static int i=5;
	static class Inner{
		void display() {
			System.out.println("Display the value of i:"+i);
		}
	}
}
public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ob = new Outer();
		System.out.println(ob.i);
		//ob.display();
		
		
		Outer.Inner i=new Outer.Inner();
		i.display();
	}

}
