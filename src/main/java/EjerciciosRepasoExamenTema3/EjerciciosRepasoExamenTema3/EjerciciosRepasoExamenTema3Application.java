package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3")
public class EjerciciosRepasoExamenTema3Application {

	public static void main(String[] args) {
		SpringApplication.run(EjerciciosRepasoExamenTema3Application.class, args);
	}

}
