package pe.edu.tecsup.tienda.webs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.tienda.dtos.ProductoDTO;

import java.util.ArrayList;
import java.util.List;

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

        List<ProductoDTO> productos = new ArrayList<>();
        productos.add(new ProductoDTO("Lenovo", 1200.0));
        productos.add(new ProductoDTO("Galaxy", 2500.0));
        productos.add(new ProductoDTO("Huawei", 1600.0));
        productos.add(new ProductoDTO("Xiaomi", 1200.1));

        model.addAttribute("productos", productos);

        return "productos";
    }

}
