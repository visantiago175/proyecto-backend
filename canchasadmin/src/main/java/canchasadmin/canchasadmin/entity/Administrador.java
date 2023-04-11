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

    /**
     *
     */
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "Correo")
    private String correo;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "contraseña")
    private String contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void Administrador(String nombre, String establecimiento, String imageUrl, String contraseña){
        this.nombre = nombre;
        this.establecimiento = establecimiento;
        this.imageUrl = imageUrl;
        this.contraseña = contraseña;
    }

    public void setGeneral(String nombre, String establecimiento, String imageUrl, String contraseña){
        this.nombre = nombre;
        this.establecimiento = establecimiento;
        this.imageUrl = imageUrl;
        this.contraseña = contraseña;
    }
    
}
