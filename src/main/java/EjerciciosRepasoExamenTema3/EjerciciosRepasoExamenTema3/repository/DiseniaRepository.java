package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models.Disenia;
import EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models.DiseñaId;


//diseñaID??
public interface DiseniaRepository extends JpaRepository<Disenia, DiseñaId> 
{

}
