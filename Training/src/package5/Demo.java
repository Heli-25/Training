package package5;

public class Demo {
	private int id;
	private String name;
	private String Designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", Designation=" + Designation + "]";
	}
	
}
