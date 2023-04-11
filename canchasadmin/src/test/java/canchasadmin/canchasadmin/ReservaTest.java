package canchasadmin.canchasadmin;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import canchasadmin.canchasadmin.entity.Reserva;
import canchasadmin.canchasadmin.repository.ReservaRepository;

@SpringBootTest (classes = Reserva.class)
public class ReservaTest {

    @Autowired
    private ReservaRepository ReservasRepo;

    @Test
    public void pruebaDeInsercionCanchas(){

        try{

            java.util.Iterator<Reserva> reserva = ReservasRepo.findAll().iterator();

                int cantidad = 0;
                while( reserva.hasNext() ) {
                    reserva.next();
                    cantidad ++;
                }

                Reserva reserva1 = new Reserva();
                reserva1.setGeneral("123", "2022-12-22", "true");
                ReservasRepo.save(reserva1);

                Reserva reserva2 = new Reserva();
                reserva2.setGeneral("323", "2022-12-23", "true");
                ReservasRepo.save(reserva2);

                Reserva reserva3 =  new Reserva();
                reserva3.setGeneral("874", "2022-12-24", "true");
                ReservasRepo.save(reserva3);

                reserva = ReservasRepo.findAll().iterator();
                int nuevaCantidad = 0;
                while(reserva.hasNext()){
                    reserva.next();
                    nuevaCantidad++;
                }
            

                assertTrue(cantidad + 3 == nuevaCantidad, "tres Administrador fueron agregadas");
        }catch (Exception e) {
            e.printStackTrace();
            assertTrue( false, "Error en la aplicación" );
            
        }

    }
}

