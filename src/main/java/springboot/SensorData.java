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

	SensorData (){
		this.sensorId = 0;

		this.speed = (float)0;
		this.speedUnit = "kmh";

		this.lat = (double) 0.0;
		this.lng = (double) 0.0;
	}

	SensorData (Integer sensorId, Float speed, String speedUnit, Double lat, Double lng) {
		this.sensorId = sensorId;

		this.speed = speed;
		this.speedUnit = speedUnit;

		this.lat = lat;
		this.lng = lng;
	}
}
