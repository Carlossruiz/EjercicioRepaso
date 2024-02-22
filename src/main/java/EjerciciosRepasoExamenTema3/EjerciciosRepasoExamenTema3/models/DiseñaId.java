package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiseñaId implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8852171312923880658L;
	
	private Long idPrueba;
	
	private String idProfesor;
}
