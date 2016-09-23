package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class C52Test {
    private C52 clase52;

    @Before
    public void before() {
        clase52 = new C52();
    }

    @Test
    public void testMA() {
        assertEquals(clase52.mA(), "mA");
    }

}
