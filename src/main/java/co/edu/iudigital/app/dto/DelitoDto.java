package co.edu.iudigital.app.dto;

import lombok.Builder;
import lombok.Data;

@Data // getter y setter
@Builder  // crea objetos con lombok

public class DelitoDto {
	private Long id;
	private String nombre;
	private String descripcion;
	

}
