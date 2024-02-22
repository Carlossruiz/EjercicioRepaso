package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IParseoPractica;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.PracticaRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoPracticaImpl implements IParseoPractica 
{
	@Autowired
	private PracticaRepository practicaRepository;
	
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
