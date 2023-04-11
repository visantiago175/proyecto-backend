package canchasadmin.canchasadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import canchasadmin.canchasadmin.service.EstServicio;

public interface EstController {
    
    @Autowired
    private EstServicio servicio;

    @CrossOrigin
    @GetMapping(value =  "/Canchas")
    public String listarCanchas(Model model){
        model.addAttribute("canchas", servicio.listarCanchas());
        return "canchas";
    }
}
