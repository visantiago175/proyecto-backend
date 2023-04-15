package canchasadmin.canchasadmin.service;

import java.util.List;
import canchasadmin.canchasadmin.entity.Reserva;

public interface ReservaServicio {
    public List<Reserva> listarReservas();
    public void crearReserva(Reserva reserva);
    public void cancelarReserva(Reserva reserva);
}