package pe.edu.tecsup.tienda.webs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

    /**
     * Muestra la lista de productos
     * @return
     */
    @GetMapping("/productos")
    public String index(Model model) throws Exception {

        model.addAttribute("mensaje",
                "Hola Mundo Aprendiendo Spring Boot");

        return "productos";
    }

}
