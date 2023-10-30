
	package diagonestic_test;
	
	import java.util.List;
	import java.util.Optional;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;


public class PatientService {
	
	public class PatientService 
	{
	    @Autowired
	    private PatientRepository patientRepository;

	    public List<Patient> getAllPatients() 
	    {
	        return patientRepository.getAll();
	    }

	    public Optional<Patient> getPatientById(Long id) 
	    {
	        return patientRepository.getById(id);
	    }

	    public Patient savePatient(Patient patient) 
	    {
	        return patientRepository.save(patient);
	    }
	}

