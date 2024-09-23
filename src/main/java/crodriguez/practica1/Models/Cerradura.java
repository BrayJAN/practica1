package crodriguez.practica1.Models;
import org.springframework.stereotype.Component;

@Component
public class Cerradura {
    
    // Método para calcular el número Fibonacci
    public int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }


}
