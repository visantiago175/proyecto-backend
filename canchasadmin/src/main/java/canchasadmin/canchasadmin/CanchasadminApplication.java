package canchasadmin.canchasadmin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import canchasadmin.canchasadmin.repository.CanchasRepository;

import canchasadmin.canchasadmin.entity.Canchas;

@SpringBootApplication
public class CanchasadminApplication implements CommandLineRunner{

	@Autowired
    private CanchasRepository canchasrepo;

	public static void main(String[] args) {
		SpringApplication.run(CanchasadminApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				Canchas cancha = new Canchas("elCampin", "cancha grande para partidos con muchos jugadores", "elCampin.jpg", "100000");
                //cancha.setValores("elCampin", "cancha grande para partidos con muchos jugadores", "elCampin.jpg", "100000");
                canchasrepo.save(cancha);

                Canchas cancha2 = new Canchas("blink", "cancha mediana para partidos con una cantidad moderada de jugadores", "blink.jpg", "80000");
                //cancha2.setValores("blink", "cancha mediana para partidos con una cantidad moderada de jugadores", "blink.jpg", "80000");
                canchasrepo.save(cancha2);

                Canchas cancha3 = new Canchas("radioUno", "cancha pequeña para partidos con pocos jugadores", "radioUno.jpg", "50000");
                //cancha3.setValores("radioUno", "cancha pequeña para partidos con pocos jugadores", "radioUno.jpg", "50000");
                canchasrepo.save(cancha3);
	}

}
