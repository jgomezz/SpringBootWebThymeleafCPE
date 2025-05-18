package pe.edu.tecsup.tienda.webs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.tienda.dtos.UsuarioDTO;

@Controller
public class UsuarioController {

    @GetMapping("/registrar")
    public String mostrarForm(Model model) {

        model.addAttribute("usuario",
                new UsuarioDTO());

        return "registrar";
    }

}
