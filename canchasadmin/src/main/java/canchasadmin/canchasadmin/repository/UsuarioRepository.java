package canchasadmin.canchasadmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import canchasadmin.canchasadmin.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Long>{
    
}
