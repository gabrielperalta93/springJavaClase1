package com.romano.romanos.controllers;

import com.romano.romanos.services.RomanoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RomanoController {
    RomanoService romanoService = new RomanoService();
    @GetMapping("/convertir/{numero}")
    public String convertNumber(@PathVariable(value = "numero") int numero){
        return romanoService.toRoman(numero);
    }
}
