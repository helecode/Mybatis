package S1122HelloWorld;
public class S1Message {
	 private int id;
	 private String name;    
	 private int age;
	 private char sex;   
	 private String education;
	 private String  phone;
	 private String  school;
	 
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public S1Message(int id, String name, int age, char sex, String education,
			String phone, String school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.education = education;
		this.phone = phone;
		this.school = school;
	}
	public S1Message() {
		super();
	}
	@Override
	public String toString() {
		return "S1Message [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", education=" + education + ", phone="
				+ phone + ", school=" + school + "]";
	}
	

	 
}
