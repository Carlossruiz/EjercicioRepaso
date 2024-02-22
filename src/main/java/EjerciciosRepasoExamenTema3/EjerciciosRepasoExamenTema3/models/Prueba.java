package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "prueba")
@Inheritance(strategy = InheritanceType.JOINED)
public class Prueba 
{

	@Id
	@Column
	private Long idPrueba;
	
	@OneToMany(mappedBy="idPrueba")
	private List<Disenia> diseniaList;
	
	@OneToMany(mappedBy="idPrueba")
	private List<Realiza> realizaList;
}
