package com.conversor_temperatura.Controller;

import com.conversor_temperatura.Services.InterfaceConversorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
    
    @Autowired
    private InterfaceConversorService conversorService;

    @GetMapping ("/{fahrenheit}")
    public double convertir(@PathVariable double fahrenheit){
        return Math.round(conversorService.convertir(fahrenheit));
    }
}
