package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model){
        var saludar = "Hola Mundo con Thymeleaf";
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje",log);

        return "index";

    }


}
