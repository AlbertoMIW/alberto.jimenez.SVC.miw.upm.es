package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class C32Test {
    private C32 clase32;

    @Before
    public void before() {
        clase32 = new C32();
    }

    @Test
    public void testMA() {
        assertEquals(clase32.mA(), "mA");
    }

}
