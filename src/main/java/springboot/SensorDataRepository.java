package springboot;

import org.springframework.data.jpa.repository.JpaRepository;

interface SensorDataRepository extends JpaRepository<SensorData, Long> {

}
