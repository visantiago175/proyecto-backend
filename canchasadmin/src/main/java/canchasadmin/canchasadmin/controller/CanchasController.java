package canchasadmin.canchasadmin.controller;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import canchasadmin.canchasadmin.repository.CanchasRepository;
import canchasadmin.canchasadmin.service.CanchasServicio;

@Controller
public class CanchasController {

    @Autowired
    private CanchasServicio servicio;

    @CrossOrigin
    @GetMapping(value =  "/Canchas")
    public String listarCanchas(Model model){
        model.addAttribute("canchas", servicio.listarCanchas());
        return "canchas";
    }
    
}
