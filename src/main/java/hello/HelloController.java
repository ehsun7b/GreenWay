package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hook")
    public String index() {
        System.out.println("hook has been called!!!!\n================================");
        return "Greetings from Spring Boot!";
    }
    
}
