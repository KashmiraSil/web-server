package diagonestic_test;
	import java.util.List;
	import java.util.Optional;

	//RestController
	//RequestMapping("/api/patients")
	
	public class PatientController 
	{
	    //Autowired
	    private PatientService patientService;

	    //GetMapping
	    public List<Patient> getAllPatients() 
	    {
	        return patientService.getAllPatients();
	    }

	    //GetMapping("/{id}")
	    public Optional<Patient> getPatientById(@PathVariable Long id)
	    {
	        return patientService.getPatientById(id);
	    }

	    //PostMapping
	    public Patient savePatient(@RequestBody Patient patient)
	    {
	        return patientService.savePatient(patient);
	    }
	}


