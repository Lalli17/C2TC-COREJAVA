package statickeyword;

public class Variable {
public static void main(String args[]) {
	

	Student s1=new Student();
	s1.usn=1;
	s1.name="Adam";
	//s1.college="JSS";
	
	//System.out.println(s1.usn+" "+s1.name+" "+s1.college);
	System.out.println(s1);
	
	Student s2=new Student();
	s2.usn=1;
	s2.name="Abhi";
	//s2.college="JSS";
	System.out.println(s2.usn+" "+s2.name+" "+s2.college);
}
}