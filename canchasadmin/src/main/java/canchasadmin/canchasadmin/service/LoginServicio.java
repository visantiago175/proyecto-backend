package canchasadmin.canchasadmin.service;

import canchasadmin.canchasadmin.entity.Administrador;

public interface LoginServicio {

    public String recuperarContraseña(String correo);
    public boolean autenticacion(String correo, String contraseña);
    
}
