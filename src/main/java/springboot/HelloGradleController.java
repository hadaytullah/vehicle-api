package springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloGradleController {

    //@GetMapping
    @RequestMapping("/")
    public String helloGradle() {
        return "Hello Gradle!";
    }

}
