package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.parsers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.interfaces.IPaserseoExamen;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository.ExamenRepository;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.utils.Unidad3Exception;

public class ParseoExamenImpl implements IPaserseoExamen
{
	@Autowired
	private ExamenRepository examenRepository;
	//private PruebaRepository pruebaRepository;--
	public void parseaFichero(Scanner scanner) throws Unidad3Exception
	{
		
	}
}
