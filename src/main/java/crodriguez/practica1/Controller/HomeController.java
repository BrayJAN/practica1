package crodriguez.practica1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import crodriguez.practica1.Models.Cerradura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    // Inyectar Cerradura
    @Autowired
    private Cerradura cerradura;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/fibonacci/{number}")
    public String fibonacci(@PathVariable("number") int number, Model model) {

        if (number < 0) {
            model.addAttribute("error", "El número no puede ser negativo.");
            return "error";
        }

        // Calcular Fibonacci
        int result = cerradura.fibonacci(number);
        model.addAttribute("result", result);
        return "fibonacci"; 
    }
}

