package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IParseoPrueba;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.PruebaRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoPruebaImpl implements IParseoPrueba 
{
	@Autowired
	private PruebaRepository pruebaRepository;
	
	
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
