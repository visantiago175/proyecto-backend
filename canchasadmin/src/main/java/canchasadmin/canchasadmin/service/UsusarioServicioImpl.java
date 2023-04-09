package canchasadmin.canchasadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import canchasadmin.canchasadmin.entity.Usuario;
import canchasadmin.canchasadmin.repository.UsuarioRepository;

@Service
public class UsusarioServicioImpl implements UsuarioServicio{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) repository.findAll();
    }
    
}
