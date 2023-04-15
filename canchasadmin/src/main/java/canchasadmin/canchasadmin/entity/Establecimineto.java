package canchasadmin.canchasadmin.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Establecimineto")
public class Establecimineto {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int  id;

    @Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

    @OneToMany(mappedBy = "Establecimineto", cascade = CascadeType.ALL)
	private List<Canchas> canchas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    public Establecimineto() {
		
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public List<Canchas> getCanchas() {
		return canchas;
	}

	public void setCanchas(List<Canchas> canchas) {
		canchas = canchas;
	}

    public void setGeneral(String nombre, Canchas cancha){
        this.nombre = nombre;
        this.canchas = (List<Canchas>) cancha;
    }
    

}
