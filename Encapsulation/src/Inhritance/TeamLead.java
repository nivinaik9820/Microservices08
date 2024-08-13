package Inhritance;

public class TeamLead {
	int pid;
	String name;
	int eid;
	public TeamLead(int pid, String name, int eid) {
		super();
		this.pid = pid;
		this.name = name;
		this.eid = eid;
	}
	public void display() {
		System.out.println(pid);
		System.out.println(name);
		System.out.println(eid);

	}
	public String projectDetails() {
		return "project is going on";
	}
	
	

}

class Team extends TeamLead{
	String tname;
	int no_of_dev;
	String pName;
	
	
	public Team(int pid, String name, int eid, String tname, int no_of_dev, String pName) {
		super(pid, name, eid);
		this.tname = tname;
		this.no_of_dev = no_of_dev;
		this.pName = pName;
	}


	public void display() {
		super.display();
		System.out.println(tname);
		System.out.println(no_of_dev);

		System.out.println(pName);


	}


	@Override
	public String projectDetails() {
		// TODO Auto-generated method stub
		return super.projectDetails();
	}
	
	
	 
	
}
