package cucumber.exam.uni;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Dentist {
	
	private String username;
    private String password;
    
    public String docFirstName;
    public String docLastName;
    public String docAddress;
    public String docPhone;
    public String docEmail;
    public String specialization;
    
    private Set<Reservation> reservations = new HashSet<Reservation>();

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDocFirstName() {
		return this.docFirstName;
	}

	public void setDocFirstName(String docFirstName) {
		this.docFirstName = docFirstName;
	}

	public String getDocLastName() {
		return this.docLastName;
	}

	public void setDocLastName(String docLastName) {
		this.docLastName = docLastName;
	}

	public String getDocAddress() {
		return docAddress;
	}

	public void setDocAddress(String docAddress) {
		this.docAddress = docAddress;
	}

	public String getDocPhone() {
		return docPhone;
	}

	public void setDocPhone(String docPhone) {
		this.docPhone = docPhone;
	}

	public String getDocEmail() {
		return docEmail;
	}

	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void setReservation(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	/**
     * Default constructor
     */
    public Dentist() {
    }

    public Dentist(String username, String password, String docFirstName, String docLastName,
    				String docAddress, String docPhone, String docEmail, String specialization) {
    	
    	this.username = username;
    	this.password = password;
    	this.docFirstName = docFirstName;
    	this.docLastName = docLastName;
    	this.docAddress = docAddress;
    	this.docPhone = docPhone;
    	this.docEmail = docEmail;
    	this.specialization = specialization;
    	
    }


    /**
     * @return
     */
    public Set getReservation() {
        // TODO implement here
        return null;
    }

    /**
     * @param reservation
     */
    public void confirmReservation(Reservation reservations) {
        // TODO implement here
    }

    /**
     * @param reservation
     */
    public void cancelReservation(Reservation reservations) {
        // TODO implement here
    }

    /**
     * 
     */
    public void sendEmail() {
        // TODO implement here
    }

}
