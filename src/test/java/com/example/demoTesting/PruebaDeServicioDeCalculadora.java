package com.example.demoTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaDeServicioDeCalculadora {

    @Autowired
    ServicioDeCalculadora objetoDePrueba;

    @BeforeClass
    public static void antesDeLaClase(){
        System.out.println("Antes de la clase");
    }

    @Before
    public void antesDeCadaPrueba() {
        System.out.println("Antes de cada prueba");
        objetoDePrueba.historial = new LinkedList<String>();
    }

    @Test
    public void pruebaDeSuma() {
        //Dado que tenemos dos enteros
        int a = 3;
        int b = 4;

        //Cuando ejecutamos la suma
        int resultado = objetoDePrueba.sumar(a, b);

        //Verificamos
        assertEquals(7, resultado);
        assertEquals(1,objetoDePrueba.historial.size());
    }

    @Test
    public void pruebaDeSumaDeDosNumerosNegativos() {
        //Dado que tenemos dos enteros
        int a = -3;
        int b = -4;

        //Cuando ejecutamos la suma
        int resultado = objetoDePrueba.sumar(a, b);

        //Verificamos
        assertEquals(-7, resultado);
        assertEquals(1,objetoDePrueba.historial.size());
    }

    @After
    public void despuesDeLasPruebas() {
        System.out.println("Despues de cada prueba");
    }

    @AfterClass
    public static void despuesDeLaClase(){
        System.out.println("Despues de la clase");
    }
}
