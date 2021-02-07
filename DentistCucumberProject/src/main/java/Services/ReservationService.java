package Services;

public class ReservationService {
	
	public static String reservation(String docFirstName, String docLastName, String patFirstName,
									String patLastName, String patPhone, String date) {
		
		if(docFirstName == null && docLastName == null && patFirstName == null && patLastName == null && patPhone == null && date == null) {
			return "Моля въведете данни!";
		}
		
		else if(docFirstName == null && docLastName == null && patFirstName == null && patLastName == null && patPhone == null) {
			return "Моля въведете празните полета!";
		}
		
		else if(patFirstName == null && patLastName == null && patPhone == null && date == null) {
			return "Моля изберете дата!";
		}
		
		else if( patFirstName == null && patLastName == null && patPhone == null) {
			return "Моля въведете лична информация";
		}

		else return "Успешно запазване на час!";
		
	}

}
