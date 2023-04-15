package canchasadmin.canchasadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import canchasadmin.canchasadmin.entity.Reserva;
import canchasadmin.canchasadmin.repository.ReservaRepository;

@Service
public class ReservaServicioImpl implements ReservaServicio{


    @Autowired
    private ReservaRepository repository;

    @Override
    public List<Reserva> listarReservas() {
        
        return (List<Reserva>) repository.findAll();
    }

    @Override
    public void crearReserva(Reserva reserva){
     repository.save(reserva);
    }

    @Override
    public void cancelarReserva(Reserva reserva) {
        repository.delete(reserva);
    }
    
}
