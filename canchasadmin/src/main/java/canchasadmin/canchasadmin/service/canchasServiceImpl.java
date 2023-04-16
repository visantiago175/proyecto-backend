package canchasadmin.canchasadmin.service;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import canchasadmin.canchasadmin.entity.Canchas;
import canchasadmin.canchasadmin.repository.CanchasRepository;

@Service
public class CanchasServiceImpl implements  CanchasServicio{

    @Autowired 
    CanchasRepository canchasRepository;

    @Override
    public List<Canchas> listarCanchas() {

        return (List<Canchas>) canchasRepository.findAll();
    }

    @Override
    public void horario(int id) {
        
    }

    @Override
    public void crearCanchas(String nombre, String descripcion, String imageUrl, String precio_referencia,
            Time horaApertura, Time horaCierre) {
        
            Canchas cancha = new Canchas();
            cancha.setValores(nombre, descripcion, imageUrl, precio_referencia, horaApertura, horaCierre);
            canchasRepository.save(cancha);
            
    }

    @Override
    public String verificarHorario(String nombre) {

        Time horarioA = null, horarioC = null;
        String horario;

        Iterable<Canchas> cancha = canchasRepository.findAll();

        for(Canchas cancha1 : cancha){
            if(cancha1.getNombre() == nombre){
                horarioA = cancha1.getHoraApertura();
                horarioC = cancha1.getHoraCierre();
            }
        }

        DateFormat dateFormat = new SimpleDateFormat("hh:mm"); 
        String strDateA = dateFormat.format(horarioA); 
        String strDateC = dateFormat.format(horarioC); 
        
        horario = "apertura:"+ strDateA + "cierre: " +strDateC;

        return horario;
    }

    
    
}
