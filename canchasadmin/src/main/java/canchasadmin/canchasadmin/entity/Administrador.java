package canchasadmin.canchasadmin.entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void Administrador(String nombre, String establecimiento, String imageUrl){
        this.nombre = nombre;
        this.establecimiento = establecimiento;
        this.imageUrl = imageUrl;
    }

    public void setGeneral(String nombre, String establecimiento, String imageUrl){
        this.nombre = nombre;
        this.establecimiento = establecimiento;
        this.imageUrl = imageUrl;
    }
    
}
