package canchasadmin.canchasadmin.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Reserva")
public class Reserva implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idJugador")
	private int idReserva;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCancha")
	private Canchas idCancha;
	
	

	@Temporal(TemporalType.DATE)	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name ="fechaReserva", nullable=false)
	private Date fechaReserva;

	@Column(name ="estadoReserva", nullable=false)
	private Boolean estadoReserva;
	
	
	public Reserva() {
		
		this.estadoReserva = true;
		
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Canchas getCancha() {
		return idCancha;
	}

	public void setCancha(Canchas cancha) {
		this.idCancha = cancha;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	
	public Boolean getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(Boolean estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	public void Reserva(Canchas Canchas, Date fechaReserva, Boolean estadoReserva){
        this.idCancha = Canchas;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
    }

    public void setGeneral(Canchas Canchas, Date fechaReserva, Boolean estadoReserva){
        this.idCancha = Canchas;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
    }

	
	
}