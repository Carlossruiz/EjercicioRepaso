package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IParseoRealiza;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.AlumnoRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.PruebaRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.RealizaRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoRealizaImpl implements IParseoRealiza 
{
	@Autowired
	private RealizaRepository realizaRepository;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private PruebaRepository pruebaRepository;
	
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
