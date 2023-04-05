package canchasadmin.canchasadmin.entity;

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

import java.time.LocalDate;
import java.time.LocalTime;

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
    private Long precio_referencia;

    // @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name="idHorario")
	// private Horario horario;
	
	@Column(name ="disponibilidad", nullable=false)
	private Boolean disponibilidad;

	// @OneToMany(mappedBy = "cancha", cascade = CascadeType.ALL)
	// private List<Reserva> Reservas;

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

    public Long getPrecio_referencia() {
        return precio_referencia;
    }

    public void setPrecio_referencia(Long precio_referencia) {
        this.precio_referencia = precio_referencia;
    }   

    public void cancha(Long id, String nombre, String descripcion, String imageUrl, Long precio_referencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imageUrl = imageUrl;
        this.precio_referencia = precio_referencia;
    }

    public void setValores(Long id, String nombre, String descripcion, String imageUrl, Long precio_referencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imageUrl = imageUrl;
        this.precio_referencia = precio_referencia;
    }

}
