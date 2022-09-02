package com.Riversua.udea.empresa.empresa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControoladorRest {

    @GetMapping("/")
    public String saludar(){
        return "hola mundo";

    }

}
