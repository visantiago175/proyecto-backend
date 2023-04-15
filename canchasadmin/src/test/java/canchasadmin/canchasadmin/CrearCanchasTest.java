package canchasadmin.canchasadmin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import canchasadmin.canchasadmin.entity.Canchas;
import canchasadmin.canchasadmin.repository.CanchasRepository;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest (classes = Canchas.class)
class crearCanchasTest {

	@Autowired
    private CanchasRepository canchasrepo;

    @Test
    public void pruebaDeInsercionCanchas(){

        try{

            java.util.Iterator<Canchas>canchas = canchasrepo.findAll().iterator();

                int cantidad = 0;
                while( canchas.hasNext() ) {
                    canchas.next();
                    cantidad ++;
                }

                Canchas cancha = new Canchas();
                cancha.setValores("elCampin", "cancha grande para partidos con muchos jugadores", "12000");
                canchasrepo.save(cancha);

                Canchas cancha2 = new Canchas();
                cancha2.setValores("elCampin", "cancha grande para partidos con muchos jugadores", "4000");
                canchasrepo.save(cancha2);

                Canchas cancha3 = new Canchas();
                cancha3.setValores("radioUno", "cancha pequeña para partidos con pocos jugadores",  "50000");
                canchasrepo.save(cancha3);

                canchas = canchasrepo.findAll().iterator();
                int nuevaCantidad = 0;
                while(canchas.hasNext()){
                    canchas.next();
                    nuevaCantidad++;
                }
            

                assertTrue(cantidad + 3 == nuevaCantidad, "tres canchas fueron agregadas");
        }catch (Exception e) {
            e.printStackTrace();
            assertTrue( false, "Error en la aplicación" );
            
        }
    }

}
