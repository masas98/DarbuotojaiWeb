package models;


public class Darbuotojai {
	private Integer id;
	private String name;
	private String surname;
	private String gender;
	private String phone;
	private String birthday;
	private String education;
	
	public Darbuotojai() {
		super();
	}
	
	

	public Darbuotojai(Integer id, String name, String surname, String gender, String phone, String birthday,
			String education) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.phone = phone;
		this.birthday = birthday;
		this.education = education;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	@Override
	public String toString() {
//		return id+" "+name+" "+surname+" "+gender+" "+phone+" "+birthday+" "+education;
		return name+" "+surname;
	}
	
	
	
	
	
	

}