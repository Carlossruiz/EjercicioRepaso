package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class RealizaId implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6694528323279918395L;
	
	
	private Long numeroMatricula;
	
	private Long id;
	
}
