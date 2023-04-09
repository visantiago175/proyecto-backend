package canchasadmin.canchasadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import canchasadmin.canchasadmin.service.AdminServicio;

@Controller
public class AdminController {

    @Autowired
    private AdminServicio servicio;

    @CrossOrigin
    @GetMapping(value =  "/Administradores")
    public String listarCanchas(Model model){
        model.addAttribute("administradores", servicio.listarAdmins());
        return "administradores";
    }

}
