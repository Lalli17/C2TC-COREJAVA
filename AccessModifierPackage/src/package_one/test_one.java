package package_one;

public class test_one {

	public int i;
	public void display()
	{
		System.out.println("access modifier");
	}
	public static void main(String args[]) {
		test_one t1=new test_one();
		t1.i=5;
		System.out.println(t1.i);
		t1.display();
	}
	
}
