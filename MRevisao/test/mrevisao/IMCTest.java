/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eae
 */
public class IMCTest {
    
    public IMCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of imcID method, of class IMC.
     */
    @Test
    public void testImcID() {
        System.out.println("imcID");
        float imc = 24;
        IMC instance = new IMC();
        String expResult = "Normal";
        String result = instance.imcID(imc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of imcValor method, of class IMC.
     */
    @Test
    public void testImcValor() {
        System.out.println("imcValor");
        float peso = 60;
        float altura = 1.60F;
        IMC instance = new IMC();
        float expResult = 23.437498F;
        float result = instance.imcValor(peso, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
