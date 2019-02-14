package springboot;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class SensorData {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY, generator="seq-gen")
	private Integer id;

	private Integer sensorId;

	private Float speed;
	private String speedUnit;

	private Double lat;
	private Double lng;

	SensorData (Integer sensorId, Float speed, String speedUnit, Double lat, Double lng) {
		this.sensorId = sensorId;

		this.speed = speed;
		this.speedUnit = speedUnit;

		this.lat = lat;
		this.lng = lng;
	}
}
