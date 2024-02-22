package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models.Realiza;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models.RealizaId;

public interface RealizaRepository extends JpaRepository<Realiza, RealizaId>   
{

}
