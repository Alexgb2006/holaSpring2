package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensajes con Thymeleaf";
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("55554545");

        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("KGomez@mail.com");
        persona2.setTelefono("1234567");

//        var personas = new ArrayList<>();
//        personas.add(persona);
//        personas.add(persona);

        var personas = Arrays.asList(persona,persona2);

        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
        model.addAttribute("persona",persona);
        model.addAttribute("personas",personas);


        return "index";

    }


}
