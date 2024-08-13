package Association_With_ARRAY;

class Bank{
	private String bname;
	private Employee[] employee;
	
	public String getBname() {
		return bname;
	}
	
	public void setBname(String bname) {
		this.bname=bname;
	}
	
	public Employee[] getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee[] employee) {
		this.employee=employee;
	}
	
}
class Employee{
	private String ename;
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	
}
public class AssociationTest {
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.setBname("SBI");
		Employee[] e=new Employee[2];
		e[0]= new Employee();
		e[0].setEname("nivedita");
		b.setEmployee(e);
		
		System.out.println(b.getEmployee()[0].getEname()+ " is working in " + b.getBname());
		
		
		
		
		
//		Employee e1= new Employee();
//		Employee e2= new Employee();
//
//		e1.setEname("Nivedita");
//		e2.setEname("Vamshi");
//		
		
//		Bank b2=new Bank();
//
		
//		b2.setBname("AXIS");
//		
//		System.out.println(e1.getEname() + " is working in " + b1.getBname());
//		System.out.println(e2.getEname() + " is working in"  + b2.getBname());

	}
}
