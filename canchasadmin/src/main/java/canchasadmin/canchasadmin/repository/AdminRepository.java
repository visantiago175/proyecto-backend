package canchasadmin.canchasadmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import canchasadmin.canchasadmin.entity.Administrador;

@Repository
public interface AdminRepository extends CrudRepository<Administrador, Long> {
    
}
