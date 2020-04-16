package com.taoke.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tk on 2020/4/12
 */
public class CalculaterTest {
    private Calculater mcalculater;
    private int a = 1;
    private int b = 3;
    @Before
    public void setUp() throws Exception{
        mcalculater = new Calculater();
    }
    @Test
    public void sum() {
        int result = mcalculater.sum(a,b);

        assertEquals("sum(a,b)",4,result);
    }


    @Test
    public void substract() {
        int result = mcalculater.substract(a,b);
        assertEquals(-2,result);
    }
}