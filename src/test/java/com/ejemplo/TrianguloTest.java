/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Julio Martínez (jmartinezm45@miumg.edu.gt)
 */
public class TrianguloTest {
    @Test
    
    //Prueba unitaria para probar la funcion de calcular el área
    public void testCalcularArea() {
        Triangulo triangulo = new Triangulo();
        double base = 6.0;
        double altura = 3.0;
        double expectedArea = 9.0;
        assertEquals(expectedArea, triangulo.calcularArea(base, altura), 0.0001);
    }
}