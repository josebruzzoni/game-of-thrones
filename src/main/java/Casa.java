import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Entity
public class Casa {
	@Id
    @GeneratedValue
    private int id;
	
	private int patrimonio;
	
	private int anioFundacion;
	
	@ManyToOne
	private Lugar origen;
	
	@ManyToOne
	private Casa vasalla;
}
