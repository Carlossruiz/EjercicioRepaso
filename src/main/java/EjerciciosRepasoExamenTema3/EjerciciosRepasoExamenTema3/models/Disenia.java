package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import java.sql.Date;

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
@Table(name = "disenia")
@Data
@NoArgsConstructor
public class Disenia 
{
	@EmbeddedId
	private Disenia diseniaId;
	
	@Column
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="id_prueba")
	@MapsId("idPrueba")
	private Prueba idPrueba;
	
	@ManyToOne
	@JoinColumn(name="id_profesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
}
