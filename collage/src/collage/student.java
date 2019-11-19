package collage;

public class student {
	
	String name;
	int rollno;
	static String course;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
	       s1.name="prajwal";
	       s1.rollno=123;

	       student s2=new student();
	       s2.name="kiran";
	       s2.rollno=1;
	       
           student.course="python";
	       System.out.println(s1.course);
	       System.out.println(s2.course);
	}

}
