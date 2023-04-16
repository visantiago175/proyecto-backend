package canchasadmin.canchasadmin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import canchasadmin.canchasadmin.repository.CanchasRepository;

import canchasadmin.canchasadmin.entity.Canchas;

@SpringBootApplication
public class CanchasadminApplication{
	public static void main(String[] args) {
		SpringApplication.run(CanchasadminApplication.class, args);
	}

}
