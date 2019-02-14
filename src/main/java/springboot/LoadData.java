package springboot;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadData {

	@Bean
	CommandLineRunner initDatabase(SensorDataRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new SensorData(1000, (float)90.0, "kmh", 2.3333, 4.5555)));
			log.info("Preloading " + repository.save(new SensorData(2000, (float)100.0, "kmh", 6.3333, 8.5555)));
		};
	}
}
