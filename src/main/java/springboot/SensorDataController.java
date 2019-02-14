package springboot;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*{

	"speed":120.0,
	"speedUnit":"kmh",
	"lat": 65.850015,
	"lng":27.590382,
	"sensorId":4001
}*/

@RestController
class SensorDataController {

	private final SensorDataRepository repository;

	SensorDataController(SensorDataRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/sensordata")
	List<SensorData> all() {
		return repository.findAll();
	}

	@PostMapping("/sensordata")
	SensorData newSensorData(@RequestBody SensorData newSensorData) {
		return repository.save(newSensorData);
	}

	// Single item

	@GetMapping("/sensordata/{id}")
	SensorData one(@PathVariable Integer id) {

		return repository.findById(id)
			.orElseThrow(() -> new SensorDataNotFoundException(id));
	}

//	@PutMapping("/sensordata/{id}")
//	SensorData replaceSensorData(@RequestBody SensorData newSensorData, @PathVariable Integer id) {
//
//		return repository.findById(id)
//			.map(sensordata -> {
//				sensordata.setName(newSensorData.getName());
//				sensordata.setRole(newSensorData.getRole());
//				return repository.save(sensordata);
//			})
//			.orElseGet(() -> {
//				newSensorData.setId(id);
//				return repository.save(newSensorData);
//			});
//	}

	@DeleteMapping("/sensordata/{id}")
	void deleteSensorData(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
