package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {
    private C11 clase11;

    @Before
    public void before() {
        clase11 = new C11();
    }
    @Test
    public void testM1() {
        assertEquals(clase11.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(clase11.m2(), "m2");
    }

}
