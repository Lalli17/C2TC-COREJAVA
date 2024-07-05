package polymorphismdemo;
class Adder{
	int add(int a ,int b) {
		return a+b;
	}
	int add(int  a,int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder a1=new Adder();
		System.out.println(a1.add(3,4));
		System.out.println(a1.add(3,5,4));
		System.out.println(a1.add(3.3f,5.5f));
	}

}
