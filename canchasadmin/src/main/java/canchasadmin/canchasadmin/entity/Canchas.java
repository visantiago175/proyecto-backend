package canchasadmin.canchasadmin.entity;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

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

    @Temporal(TemporalType.DATE)	
	@DateTimeFormat(pattern = "HH-mm")
	@Column(name ="fechaReserva", nullable=false)
	private Time horaApertura;

    public Time getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    @Temporal(TemporalType.DATE)	
	@DateTimeFormat(pattern = "HH-mm")
	@Column(name ="fechaReserva", nullable=false)
	private Time horaCierre;


    public Time getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
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

    public Canchas(String nombre, String descripcion, String imageUrl, String precio_referencia, Time horaApertura , Time horaCierre){
        this.nombre = nombre;
        this.descripcion = descripcion;
        //this.imageUrl = imageUrl;
        this.precio_referencia = precio_referencia;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public void setValores(String nombre, String descripcion, String imageUrl, String precio_referencia, Time horaApertura , Time horaCierre){
        this.nombre = nombre;
        this.descripcion = descripcion;
        //this.imageUrl = imageUrl;
        this.precio_referencia = precio_referencia;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

}
