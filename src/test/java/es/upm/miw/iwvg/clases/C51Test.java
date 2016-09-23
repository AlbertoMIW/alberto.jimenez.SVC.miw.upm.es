package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
    private C51 clase51;

    @Before
    public void before() {
        clase51 = new C51();
    }
    @Test
    public void testM1() {
        assertEquals(clase51.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(clase51.m2(), "m2");
    }

}
