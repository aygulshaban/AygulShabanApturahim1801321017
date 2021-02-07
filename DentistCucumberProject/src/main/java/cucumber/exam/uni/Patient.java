package cucumber.exam.uni;

import java.util.HashSet;
import java.util.Set;


/**
 * 
 */
public class Patient {
	
    public String patFirstName;
    public String patLastName;
    public int patAge;
    public String patPhone;
    public String patEmail;
    public String patGender;

    public Set<Appointment> appointments = new HashSet<Appointment>();
    private Set<Reservation> reservations = new HashSet<Reservation>();

    /**
     * Default constructor
     */
    public Patient() {
    }

    public Patient(String patFirstName, String patLastName, int patAge,String patPhone,
    				String patEmail, String patGender ) {
    	
    	this.patFirstName = patFirstName;
    	this.patLastName = patLastName;
    	this.patAge= patAge;
    	this.patPhone = patPhone;
    	this.patEmail = patEmail;
    	this.patGender = patGender;
    }

    public String getPatFirstName() {
		return patFirstName;
	}

	public void setPatFirstName(String patFirstName) {
		this.patFirstName = patFirstName;
	}

	public String getPatLastName() {
		return patLastName;
	}

	public void setPatLastName(String patLastName) {
		this.patLastName = patLastName;
	}

	public int getPatAge() {
		return patAge;
	}

	public void setPatAge(int patAge) {
		this.patAge = patAge;
	}

	public String getPatPhone() {
		return patPhone;
	}

	public void setPatPhone(String patPhone) {
		this.patPhone = patPhone;
	}

	public String getPatEmail() {
		return patEmail;
	}

	public void setPatEmail(String patEmail) {
		this.patEmail = patEmail;
	}

	public String getPatGender() {
		return patGender;
	}

	public void setPatGender(String patGender) {
		this.patGender = patGender;
	}

	public void setAppointment(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public void setReservation(Set<Reservation> reservations) {
		this.reservations = reservations;
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
    public void makeReservation(Reservation reservation) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Set getAppointment() {
        // TODO implement here
        return null;
    }

    /**
     * @param appointment
     */
    public void makeAppointment(Appointment appointment) {
        // TODO implement here
    }

}
