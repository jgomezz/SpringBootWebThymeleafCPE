package pe.edu.tecsup.tienda.webs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello")
    public String home() {
        return "Hello, World Again!";
    }

}
