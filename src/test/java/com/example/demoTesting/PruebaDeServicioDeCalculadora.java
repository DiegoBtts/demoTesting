package com.example.demoTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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

    @After
    public void despuesDeLasPruebas() {
        System.out.println("Despues de cada prueba");
    }

    @AfterClass
    public static void despuesDeLaClase(){
        System.out.println("Despues de la clase");
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

    @Test
    public void pruebaDeMultiplicacion(){
        //Dado que tenemos dos flotantes
        float a = 3.0F;
        float b = 4.99F;

        //Cuando ejecutamos la suma
        float resultado = objetoDePrueba.multiplicar(a, b);

        //Verificamos
        assertEquals(14.97F, resultado,0.1);
        assertEquals(1,objetoDePrueba.historial.size());
    }

    @Test
    public void pruebaDeDivicion() throws Exception{
        //Dado que tenemos dos flotantes
        double a = 3.0;
        double b = 1.0;

        //Cuando ejecutamos la suma
        double resultado = objetoDePrueba.dividir(a, b);

        //Verificamos
        assertEquals(3.0, resultado,0.1);
        assertEquals(1,objetoDePrueba.historial.size());
    }
    @Ignore
    @Test(expected = ServicioDeCalculadora.DivisionEntreCeroException.class)
    public void pruebaDeDivicionEntreCero() throws Exception{
        //Dado que tenemos dos flotantes
        double a = 3.0;
        double b = 0.0;

        //Cuando ejecutamos la suma
        double resultado = objetoDePrueba.dividir(a, b);

        //Verificamos

    }


}
