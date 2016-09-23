package es.upm.miw.iwvg.clases;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class C12Test {
    private C12 clase12;

    @Before
    public void before() {
        clase12 = new C12();
    }

    @Test
    public void testMA() {
        assertEquals(clase12.mA(), "mA");
    }

}
