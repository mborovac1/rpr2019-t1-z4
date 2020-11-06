package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    public void testKonstruktora() {
        Artikl artikl = new Artikl("Kimono", 100, "1");
        assertAll("test konstruktora",
                () -> assertEquals("Kimono", artikl.getNaziv()),
                () -> assertEquals(100, artikl.getCijena()),
                () -> assertEquals("1", artikl.getKod())
        );
    }
}