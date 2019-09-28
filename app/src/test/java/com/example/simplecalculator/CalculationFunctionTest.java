package com.example.simplecalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationFunctionTest {
    Functionalities ob1 = new Functionalities();

    @Test
    public void additionTest( )
    {
         assertEquals("4.0",ob1.add(2.0,2.0).toString());
        assertEquals("8.8",ob1.add(6.8,2.0).toString());


    }
    @Test
    public void subtractionTest( )
    {
        assertEquals("4.0",ob1.subtract(8.0,4.0).toString());
        assertEquals("9.8",ob1.subtract(11.8,2.0).toString());
        assertEquals("-3.0",ob1.subtract(2.0,5.0).toString());

    }

    @Test
    public void mutipl( )
    {
        assertEquals("4.0",ob1.multiply(2.0,2.0).toString());
        assertEquals("13.6",ob1.multiply(6.8,2.0).toString());
        assertEquals("-10.0",ob1.multiply(-5.0,2.0).toString());

    }

    @Test
    public void divisionTest( )
    {
        assertEquals("4.0",ob1.divide(8.0,2.0).toString());
        assertEquals("3.4",ob1.divide(6.8,2.0).toString());
        assertEquals("-2.5",ob1.divide(-5.0,2.0).toString());

    }

    

}
