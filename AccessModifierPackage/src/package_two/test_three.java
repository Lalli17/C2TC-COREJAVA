package package_two;
import package_one.test_one;
public class test_three extends test_one
{		
	public static void main(String args[]) {
		test_one t1=new test_one();
		t1.i=5;
		System.out.println(t1.i);
		t1.display();
	}
}
