package canchasadmin.canchasadmin.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Establecimineto")
public class Establecimiento {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int  id;

    @Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

    @OneToMany(mappedBy = "Establecimineto", cascade = CascadeType.ALL)
	private int idCanchas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public int getCanchas() {
		return this.idCanchas;
	}

    public Establecimiento(){
    }

    public Establecimiento(String nombre, int idCancha){
        this.nombre = nombre;
        this.idCanchas = idCancha;
    }

    public void setGeneral(String nombre, int idCancha){
        this.nombre = nombre;
        this.idCanchas = idCancha;
    }
    

}
