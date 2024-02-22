package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alumno")
@Data
@NoArgsConstructor
public class Alumno 
{

	@Id
	@Column
	private Long numeroMatricula;
	
	@Column
	private String nombre;
	
	@Column
	private String grupo;
	
	@OneToMany(mappedBy="idAlumno")
	private List<Realiza> realizaList;
}
