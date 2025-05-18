package pe.edu.tecsup.tienda.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;

    @NotBlank(message = "Nombre es requerido")
    @Size(min = 2, max = 5, message = "El nombre debe tener entre 2 y 5 characters")
    private String nombre;

    @NotBlank(message = "Apelldos es requerido")
    private String apellidos;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 120, message = "Age must be less than 120")
    private Integer edad;
}
