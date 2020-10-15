package com.example.demoTesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaDeServicioDeCalculadora {

    @Autowired
    ServicioDeCalculadora objetoDePrueba;

    @Test
    public void pruebaDeSuma() {
        System.out.println("pruebaDeSuma");
        //Dado que tenemos dos enteros
        int a = 3;
        int b = 4;

        //Cuando ejecutamos la suma
        int resultado = objetoDePrueba.sumar(a, b);

        //Verificamos
        assertEquals(7, resultado);
    }
}
