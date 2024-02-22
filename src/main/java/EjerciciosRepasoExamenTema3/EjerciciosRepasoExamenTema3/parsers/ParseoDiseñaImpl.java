package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IParseoDiseña;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.DiseniaRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.ProfesorRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.PruebaRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoDiseñaImpl implements IParseoDiseña 
{
	@Autowired
	private DiseniaRepository diseñaRepository;
	
	@Autowired
	private PruebaRepository pruebaRepository;
	
	@Autowired
	private ProfesorRepository profesorRepository;
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
