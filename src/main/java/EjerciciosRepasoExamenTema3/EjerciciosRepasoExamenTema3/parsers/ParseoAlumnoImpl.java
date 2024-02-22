package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IParseoAlumno;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.AlumnoRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoAlumnoImpl implements IParseoAlumno
{
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
