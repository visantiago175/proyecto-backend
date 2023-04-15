package canchasadmin.canchasadmin.service;

import org.springframework.beans.factory.annotation.Autowired;

import canchasadmin.canchasadmin.entity.Administrador;
import canchasadmin.canchasadmin.repository.AdminRepository;

public class LoginServicioImpl implements LoginServicio{

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Iterable<Administrador> recuperarContraseña() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarContraseña'");
    }

    @Override
    public Iterable<Administrador> autenticacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticacion'");
    }
    
}
