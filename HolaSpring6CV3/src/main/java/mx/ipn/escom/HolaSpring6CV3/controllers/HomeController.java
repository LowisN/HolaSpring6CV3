package mx.ipn.escom.HolaSpring6CV3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirigirHola() {
        return "hola"; // Retorna el nombre del archivo HTML en templates/
    }
}