package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
    private C31 clase31;

    @Before
    public void before() {
        clase31 = new C31();
    }
    @Test
    public void testM1() {
        assertEquals(clase31.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(clase31.m2(), "m2");
    }

}
