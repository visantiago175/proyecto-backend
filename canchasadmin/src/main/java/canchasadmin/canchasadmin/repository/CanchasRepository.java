package canchasadmin.canchasadmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import canchasadmin.canchasadmin.entity.Canchas;

@Repository
public interface CanchasRepository extends CrudRepository<Canchas, Long>{
    
}
