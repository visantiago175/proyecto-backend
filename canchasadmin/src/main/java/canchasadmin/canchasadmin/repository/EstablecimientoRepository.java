package canchasadmin.canchasadmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import canchasadmin.canchasadmin.entity.Establecimiento;

@Repository
public interface EstablecimientoRepository extends CrudRepository <Establecimiento, Long> {
    
}
