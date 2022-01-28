package models;

public class User {
	/**
	 * Vartotojo ID
	 */
	private int id;
	
	/**
	 * Vartotojo vardas
	 */
	private String name;
	
	/**
	 * Užkoduotas slaptažodis
	 */
	private String password;
	
	public User() {
		
	}
	

	public User(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}


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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
