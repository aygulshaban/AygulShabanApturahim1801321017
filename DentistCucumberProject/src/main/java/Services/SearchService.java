package Services;

import java.util.ArrayList;
import java.util.List;

import cucumber.exam.uni.Dentist;

public class SearchService {
	
	public static String search(String docFirstName, String docLastName, String specialization) {
		
		
		if(docFirstName == null && docLastName == null && specialization == null) {
			return "Моля въведете данни за търсене!";
		}
		

		if(docFirstName == null && docLastName == null) {
			return "Моля въведете име и фамилия!";
		}
		
		if(docLastName == null) {
			return "Моля въведете фамилия!";
		}
		
		if(specialization == null) {
			return "Моля въведете специализация!";
		}
		
		List<Dentist> dentists = getDentists();
		
		boolean isDentistExist = dentists.stream().anyMatch(dentist -> 
												(dentist.getDocFirstName().equals(docFirstName) 
												 && dentist.getDocLastName().equals(docLastName)
												 && dentist.getSpecialization().equals(specialization)));
	
		return isDentistExist?"Моля изчакайте!":"";
	}
	
	public static List<Dentist> getDentists() {
		Dentist dentist = new Dentist();
		dentist.setDocFirstName("Иван");
		dentist.setDocLastName("Иванов");
		dentist.setSpecialization("Зъботехник");
		ArrayList<Dentist> dentists = new ArrayList<Dentist>();
		dentists.add(dentist);
		return dentists;
	}

}
