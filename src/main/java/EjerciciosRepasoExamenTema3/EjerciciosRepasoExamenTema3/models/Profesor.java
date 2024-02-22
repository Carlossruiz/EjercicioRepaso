package EjerciciosRepasoExamenTema3.EjerciciosRepasoExamenTema3.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "profesor")
@Data
@NoArgsConstructor
public class Profesor 
{
    @Id
    @Column
    private String dni;

    @Column
    private String nombre;

    @OneToMany(mappedBy = "idProfesor")
    private List<Disenia> diseniaList;
    
}