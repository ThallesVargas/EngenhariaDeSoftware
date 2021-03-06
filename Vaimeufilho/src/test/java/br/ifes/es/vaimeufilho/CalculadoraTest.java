/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1998547
 */
public class CalculadoraTest {
    
    private Calculadora instance;
    
    public CalculadoraTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Calculadora();
    }
   
    @Test
    public void converterI() {
        int expResult = 1;        
        int result = instance.calcular("I");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterV() {
        int expResult = 5;        
        int result = instance.calcular("V");
        assertEquals(expResult, result);
    }
    

    
    @Test
    public void converterII() {
        int expResult = 2;        
        int result = instance.calcular("II");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterIV() {
        int expResult = 4;        
        int result = instance.calcular("IV");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterVI() {
        int expResult = 6;        
        int result = instance.calcular("VI");
        assertEquals(expResult, result);
    }
   
    @Test
    public void converterXXXII() {
        int expResult = 32;        
        int result = instance.calcular("XXXII");
        assertEquals(expResult, result);
    }
}
