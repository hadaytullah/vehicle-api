package springboot;

class SensorDataNotFoundException extends RuntimeException {

	SensorDataNotFoundException(Integer id) {
		super("Could not find sensor data " + id);
	}
}
