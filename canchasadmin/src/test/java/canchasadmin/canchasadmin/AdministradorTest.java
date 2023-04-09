package canchasadmin.canchasadmin;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import canchasadmin.canchasadmin.entity.Administrador;
import canchasadmin.canchasadmin.repository.AdminRepository;

@SpringBootTest (classes = Administrador.class)
public class AdministradorTest {

    @Autowired
    private AdminRepository adminRepo;

    @Test
    public void pruebaAdministrador(){

        try{

            java.util.Iterator<Administrador> administradores = adminRepo.findAll().iterator();

                int cantidad = 0;
                while( administradores.hasNext() ) {
                    administradores.next();
                    cantidad ++;
                }

                Administrador administradores1 = new Administrador("jota mario", "elCampin", "./resources/images/messirve.jpg");
                adminRepo.save(administradores1);

                Administrador administradores2 = new Administrador("tom delonge", " blink", "./src/main/resources/images/Tom-DeLonge-Boomer.jpg");
                adminRepo.save(administradores2);

                Administrador administradores3 = new Administrador("Leonel Messi", "radioUno", "./src/main/resources/images/messirve.jpg");
                adminRepo.save(administradores3);

                administradores = adminRepo.findAll().iterator();
                int nuevaCantidad = 0;
                while(administradores.hasNext()){
                    administradores.next();
                    nuevaCantidad++;
                }
            

                assertTrue(cantidad + 3 == nuevaCantidad, "tres Administrador fueron agregadas");
        }catch (Exception e) {
            e.printStackTrace();
            assertTrue( false, "Error en la aplicación" );
            
        }

    }
    
}
