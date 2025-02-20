package mx.ipn.escom.HolaSpring6CV3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Ruta base: http://localhost:8080/api
public class HolaController {

    @GetMapping("/hola")  // Endpoint: http://localhost:8080/api/hola
    public String holaMundo() {
        return "¡Hola Mundo desde Spring Boot!";
    }
}
