package class_05_practice;

public class Employee {
	private Integer empid;
	private String name;
	private String email;
	
	public Employee (int empid,String name,String email) {
		super();
		this.setEmpid(empid);
		this.setName(name);
		this.setEmail(email);
		
	}
	
	public static void main(String[] args) {

	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
public String toString() {
	return empid+"\t"+name+"\t"+email;
}
}