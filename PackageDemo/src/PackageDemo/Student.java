package PackageDemo;

public class Student {
	int usn;
	String name;
	float marks;
	char gender;
	
	void add(int id,String fullname,float scores) {
		usn=id;
		name=fullname;
		marks=scores;
	}
	Student(){
		
	}
	Student(int id,String fname)
	{
		usn=id;
		name=fname;
		System.out.println(id+" "+name+" ");
	}
	
	public static void main(String args[]) 
	{
		Student s1 = new Student();
		
		s1.usn=1;
		s1.name="sunil";
		s1.marks=98;
		s1.gender='M';
		 System.out.println(s1.usn+" "+s1.name+" "+s1.marks+" "+s1.gender);
		Student s2=new Student();
		
		s2.add(2,"Rajesh",99);
		System.out.println(s2.usn+" "+s2.name+" "+s2.marks);
		
		Student s3=new Student(3,"Anusha");
		System.out.println(s3.usn+" "+s3.name+" ");
	
	}
}
