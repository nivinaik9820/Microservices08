package EncapsulationT;
class Student{
	private String name;
	private int rollno;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setId(int id) {
		this.id=id;
	}
}

public class EncapsulationTest {
	public static void main(String args[]) {
		Student s= new Student();
		s.setName("Nivedita");
		s.setRollno(96);
		s.setId(2483303);
		
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(s.getId());

	}

}
