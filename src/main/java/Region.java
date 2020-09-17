

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Entity
public class Region {
	
	@Id
    @GeneratedValue
    private int id;
	
	private String nombre;
	
	@OneToOne
	private Casa casa;
	
	
}
