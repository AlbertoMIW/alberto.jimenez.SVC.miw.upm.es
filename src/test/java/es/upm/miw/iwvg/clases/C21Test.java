package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
    private C21 clase21;

    @Before
    public void before() {
        clase21 = new C21();
    }
    @Test
    public void testM1() {
        assertEquals(clase21.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(clase21.m2(), "m2");
    }

}
