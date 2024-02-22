package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "examen")
public class Examen extends Prueba 
{
	
	@Column
	private Integer numeroPreguntas;
	
}
