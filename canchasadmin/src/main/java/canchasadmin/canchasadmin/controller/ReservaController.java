package canchasadmin.canchasadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {
    
    @Autowired
    private ReservaServicio servicio;

    @CrossOrigin
    @GetMapping(value =  "/Administradores")
    public String listarCanchas(Model model){
        model.addAttribute("Reservas", servicio.listarAdmins());
        return "Reservas";
    }

}
