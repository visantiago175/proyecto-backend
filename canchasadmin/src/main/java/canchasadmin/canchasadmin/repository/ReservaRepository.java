package canchasadmin.canchasadmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import canchasadmin.canchasadmin.entity.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository <Reserva, Long> {
    
}
