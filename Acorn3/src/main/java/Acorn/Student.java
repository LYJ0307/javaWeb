package Acorn;

public class Student {
	

	String id;
	String pw;
	String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [아이디 =" + id + ", 비밀번호 =" + pw + ", 이름 =" + name + "]";
	}
	
	
	public Student(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
	public Student() {}
	

}
