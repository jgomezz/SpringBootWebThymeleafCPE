package pe.edu.tecsup.tienda.webs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("mensaje",
                "Bienvenido a Spring Boot con  Thymeleaf");

        return "home";
    }

}
