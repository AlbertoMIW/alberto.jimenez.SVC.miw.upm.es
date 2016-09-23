package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class C22Test {
    private C22 clase22;

    @Before
    public void before() {
        clase22 = new C22();
    }

    @Test
    public void testMA() {
        assertEquals(clase22.mA(), "mA");
    }

}
