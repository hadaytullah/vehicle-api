package springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class SensorDataAPI {

    @RequestMapping(
			value = "/data",
			method = RequestMethod.GET
		)
    public String helloSensor() {
        return "Sensor API is live!";
    }

}
