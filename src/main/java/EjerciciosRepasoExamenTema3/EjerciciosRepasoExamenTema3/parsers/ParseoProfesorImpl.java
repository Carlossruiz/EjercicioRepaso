package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IParseoProfesor;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.ProfesorRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoProfesorImpl implements IParseoProfesor
{
	@Autowired
	private ProfesorRepository profesorRepository;
	
	
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
