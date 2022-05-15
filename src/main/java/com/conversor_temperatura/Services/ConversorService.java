package com.conversor_temperatura.Services;

import org.springframework.stereotype.Service;

@Service
public class ConversorService implements InterfaceConversorService {

    @Override
    public double convertir(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
    
}
