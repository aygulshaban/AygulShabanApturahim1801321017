package cucumber.exam.uni;

import java.util.Date;
import java.util.Set;

/**
 * 
 */
public class Reservation {
	
    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    public String id;

    /**
     * 
     */
    public String title;

    /**
     * 
     */
    public Date date;



    /**
     * 
     */
    public Patient patient;

    /**
     * 
     */
    public Dentist dentist;
    
    public Set<Dentist> dentists;
    public Set<Patient> patients;
    

}