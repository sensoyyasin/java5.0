package entities.concretes;

public class Product {
	private String emailId;
	private String name;
	private String sirName;
	private String passwordId;
	
	public Product() {
		
	}
	
	public Product(String emailId, String name, String sirName, String passwordId) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.sirName = sirName;
		this.passwordId = passwordId;
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSirName() {
		return sirName;
	}

	public void setSirName(String sirName) {
		this.sirName = sirName;
	}

	public String getPasswordId() {
		return passwordId;
	}

	public void setPasswordId(String passwordId) {
		this.passwordId = passwordId;
	}
	
}
