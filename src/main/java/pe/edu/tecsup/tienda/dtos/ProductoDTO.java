package pe.edu.tecsup.tienda.dtos;

import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class ProductoDTO {

    private Long id;
    private Long categoria_id;
    private CategoriaDTO categoria;
    @NonNull
    private String nombre;
    private String descripcion;
    @NonNull
    private Double precio;
    private Integer stock;
    private String imagen_nombre;
    private String imagen_tipo;
    private Long imagen_tamanio;
    private Integer estado;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime creado;

}
