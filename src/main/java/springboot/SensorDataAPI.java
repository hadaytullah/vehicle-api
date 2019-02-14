package springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SensorDataAPI {

    @RequestMapping("/data")
    public String helloSensor() {
        return "Sensor API is live!";
    }

}
