package com.example.demoTesting;

import org.springframework.stereotype.Service;

@Service
public class ServicioDeCalculadora {

    public int sumar(final int a, final int b) {
        return a + b;
    }

}
