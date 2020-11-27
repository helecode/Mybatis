package S1122HelloWorld;

import org.apache.ibatis.type.Alias;

@Alias("messageM")
public class S5MessageM {
	 private int id;
	 private String name;    
	 private int age;
	 private char sex;   
	 private String education;
	 private String  phone;
	 private String  school;
	 private S4Email email;
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
	
	
	public S4Email getEmail() {
		return email;
	}
	public void setEmail(S4Email email) {
		this.email = email;
	}
	public S5MessageM(int id, String name, int age, char sex, String education,
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
	public S5MessageM() {
		super();
	}
	
	public S5MessageM(int id, String name, int age, char sex,
			String education, String phone, String school, S4Email email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.education = education;
		this.phone = phone;
		this.school = school;
		this.email = email;
	}
	@Override
	public String toString() {
		return "T05MessageM [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", education=" + education + ", phone="
				+ phone + ", school=" + school + ", email=" + email + "]";
	}

	 
}
