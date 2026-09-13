package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddition()
    {
      Calculator calculator= new Calculator();
	 
	int result=calculator.add(2,3);
	
	assertEquals(5,result);
    }
}
