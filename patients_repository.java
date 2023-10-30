   import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;
   import org.springframework.stereotype.diagonestic_tes;

	package diagonestic_test;
	
	public class patients_repository { 
	    private List<Patient> patients = new ArrayList<>();

	    public List<Patient> getAll() {
	        return patients;
	    }

	    public Optional<Patient> getById(Long id) {
	        return patients.stream().filter(p -> p.getId().equals(id)).findFirst();
	    }

	    public Patient save(Patient patient) {
	        patient.setId((long) (patients.size() + 1));
	        patients.add(patient);
	        return patient;
	    }
	}

