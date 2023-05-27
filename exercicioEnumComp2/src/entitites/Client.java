package entitites;

import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Client: " + this.name + " (" + this.birthDate.toString() + ") "
				+ this.email;
	}
	
}
