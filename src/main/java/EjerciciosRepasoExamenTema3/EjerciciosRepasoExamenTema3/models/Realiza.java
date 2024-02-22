package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "realiza")
@Data
@NoArgsConstructor
public class Realiza 
{
	@EmbeddedId
	private RealizaId realizaId;
	
	@Column
	private String fecha;
	
	@Column
	private Double nota;
	
	@ManyToOne
	@JoinColumn(name="id_matricula")
	@MapsId("numeroMatricula")
	private Alumno idAlumno;
	
	@ManyToOne
	@JoinColumn(name="id_prueba")
	@MapsId("id")
	private Prueba idPrueba;
}

