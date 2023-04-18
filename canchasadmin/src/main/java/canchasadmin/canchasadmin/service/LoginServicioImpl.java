package canchasadmin.canchasadmin.service;

import org.springframework.beans.factory.annotation.Autowired;

import canchasadmin.canchasadmin.entity.Administrador;
import canchasadmin.canchasadmin.repository.AdminRepository;
// import canchasadmin.canchasadmin.repository.UsuarioRepository;

public class LoginServicioImpl implements LoginServicio{

    @Autowired
    private AdminRepository adminRepository;

    // @Autowired
    // private UsuarioRepository UsRepository;

    @Override
    public String recuperarContraseña(String correo) {

        Administrador admin = adminRepository.findByCorreo(correo);

        String contraseña = admin.getContraseña();

        return contraseña;
    }

    @Override
    public boolean autenticacion(String correo, String contraseña) {

        boolean autenticacion = false;

        Administrador admin = adminRepository.findByCorreo(correo);

        if(contraseña == admin.getContraseña()){
            autenticacion = true;
        }

        return autenticacion; 
    }
    
}
