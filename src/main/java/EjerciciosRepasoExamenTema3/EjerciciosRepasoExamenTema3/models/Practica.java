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
@Table(name = "practica")
public class Practica  extends Prueba
{
	
	
	@Column
	private String titulo;
	
	@Column
	private String dificultad;
}
