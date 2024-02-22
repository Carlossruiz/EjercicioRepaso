package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Unidad3Exception extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6432749235092596407L;
	
	private int code;
	
	private String erro;

}
