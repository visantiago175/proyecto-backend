package canchasadmin.canchasadmin.service;

import canchasadmin.canchasadmin.entity.Administrador;

public interface LoginServicio {

    public Iterable<Administrador> recuperarContraseña();
    public Iterable<Administrador> autenticacion();
    
}
