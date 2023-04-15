package canchasadmin.canchasadmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "canchas")
public class Canchas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name="precio_referencia")
    private String precio_referencia;

    public Canchas(String string, String string2, String string3, String string4) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getPrecio_referencia() {
        return precio_referencia;
    }

    public void setPrecio_referencia(String precio_referencia) {
        this.precio_referencia = precio_referencia;
    }   

    public Canchas(){
    }

    public Canchas(String nombre, String descripcion, /*String imageUrl,*/ String precio_referencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        //this.imageUrl = imageUrl;
        this.precio_referencia = precio_referencia;
    }

    public void setValores(String nombre, String descripcion,  /*String imageUrl,*/String precio_referencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        //this.imageUrl = imageUrl;
    }

}
