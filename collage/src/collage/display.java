package collage;

public class display {
	String name;
	int rollno;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display s1=new display();
		s1.name="prajwal";
		s1.rollno=123;
		s1.dis();

		display s2=new display();
		s2.name="kiran";
		s2.rollno=1;
		s2.dis();
	}
	public void dis(){
		System.out.println("NAME:"+name+" ROLLNO:"+rollno);
		}


}
