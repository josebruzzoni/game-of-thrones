import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;


@Entity
@Inheritance(strategy = SINGLE_TABLE) //porque comparten varios atributos, no vale la pena mas tablas (?
@DiscriminatorColumn(name = "tipo")
public class Lugar {
	@Id
    @GeneratedValue
    private int id;
	
	private String nombre;
	
	private int anioFundacion;
	
	private int poblacion;
	
	@ManyToMany
	private List<Region> regiones;
	
}
