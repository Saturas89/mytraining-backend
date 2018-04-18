package mytraining;

import java.time.LocalDate;
import java.util.HashMap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TrainingController.TRAINING_BASE_URI)
public class TrainingController {
	
	public static final String TRAINING_BASE_URI ="training/v1/daten";
	HashMap<Integer,String> daten = new HashMap<>();
	
	@GetMapping
	public HashMap<Integer,String>getDaten( ) {
		return daten;
	}
 
	@PostMapping("/create")
	public void createDaten() {
		daten.put(5, "datum");
	}
	
	@PostMapping
	public void addDate(@RequestBody final String date, @RequestBody final Integer user) {
		daten.put(user, date);
	}
	
	
}
