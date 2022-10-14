package com.example.springbootthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// thymeleaf wymaga, aby klasa, która będzie zwracałą jakiś plik html/należący do silnika thymeleaf miała taką adnotację
@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model) {
        Car car = new Car("DEUU", "Matiz");

        model.addAttribute("marka", "gówno");
        model.addAttribute("name", "szmata"); // model jest teraz widoczny w klasie Hello
        model.addAttribute("car", car);

        return "car"; // trzeba teraz utworzyć taki plik w html, nazwa powinna być identyczna
    }
}
