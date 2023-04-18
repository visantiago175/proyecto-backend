package canchasadmin.canchasadmin.service;

public interface LoginServicio {

    public String recuperarContraseña(String correo);
    public boolean autenticacion(String correo, String contraseña);
    
}
