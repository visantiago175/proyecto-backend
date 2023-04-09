package canchasadmin.canchasadmin.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import canchasadmin.canchasadmin.service.UsuarioServicio;


@controller
public class UsuarioController {
    @Autowired
    private UsuarioServicio servicio;

    @CrossOrigin
    @GetMapping(value =  "/Usuarios")
    public String listarCanchas(Model model){
        model.addAttribute("Usuarios", servicio.listarUsuarios());
        return "Usuarios";
    }
}
