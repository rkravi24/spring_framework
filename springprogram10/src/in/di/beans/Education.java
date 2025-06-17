package in.di.beans;

public class Education {

	private String college;
	private String course;
	private String branch;
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String toString() {
		return "College-"+college+", Course- "+course+", Branch- "+branch;
	}
	
}
