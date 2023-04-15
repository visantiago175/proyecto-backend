package canchasadmin.canchasadmin.entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name = "Usuario")
public class Usuario {
    
    /**
     *
     */
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
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

    public Usuario(){
    }

    public Usuario (String nombre, String correo, String imageUrl, String contraseña){
        this.nombre = nombre;
        this.imageUrl = imageUrl;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public void setGeneral(String nombre, String correo, String imageUrl, String contraseña){
        this.nombre = nombre;
        this.correo = correo;
        this.imageUrl = imageUrl;
        this.contraseña = contraseña;
    }

}