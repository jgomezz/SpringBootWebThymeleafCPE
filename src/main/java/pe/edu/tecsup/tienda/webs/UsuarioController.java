package pe.edu.tecsup.tienda.webs;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.tecsup.tienda.dtos.UsuarioDTO;

@Controller
public class UsuarioController {

    @GetMapping("/registrar")
    public String mostrarForm(Model model) {

        model.addAttribute("usuario",
                new UsuarioDTO());

        return "registrar";
    }


    @PostMapping("/registrar")
    public String registrar(@Valid @ModelAttribute("usuario") UsuarioDTO usuario,
                            BindingResult result,
                            Model model) {
        // Validar el formulario
        if (result.hasErrors()) {
            model.addAttribute("message", "Errores!");
        } else {
            model.addAttribute("message", "Registro exitoso!");
        }

        return "registrar";
    }

}
