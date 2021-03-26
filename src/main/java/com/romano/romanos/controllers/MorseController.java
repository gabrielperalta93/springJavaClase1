package com.romano.romanos.controllers;

import com.romano.romanos.services.MorseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    MorseService morseService = new MorseService();

    @GetMapping("/convertirMorse/{texto}")
    public String convertNumber(@PathVariable(value = "texto") String texto){
        return morseService.traducir(texto);
    }
}
