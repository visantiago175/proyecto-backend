package canchasadmin.canchasadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import canchasadmin.canchasadmin.entity.Administrador;
import canchasadmin.canchasadmin.repository.AdminRepository;

@Service
public class AdminServicioImpl implements AdminServicio {

    @Autowired
    private AdminRepository repositorio;

    @Override
    public List<Administrador> listarAdmins() {
        
        return (List<Administrador>) repositorio.findAll();
    }

    @Override
    public void agregarCancha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarCancha'");
    }
    
}
