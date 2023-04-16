package canchasadmin.canchasadmin.service;

import java.sql.Time;
import java.util.List;

import canchasadmin.canchasadmin.entity.Canchas;

public interface CanchasServicio {
    
    public List<Canchas> listarCanchas();
    public void horario(int id);
    public void crearCanchas(String nombre, String descripcion, String imageUrl, String precio_referencia, Time horaApertura , Time horaCierre);
    public String verificarHorario(String nombre);

}
