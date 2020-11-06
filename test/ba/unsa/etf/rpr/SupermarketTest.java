package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Supermarket s = new Supermarket();
    Artikl[] artikli = new Artikl[5];

    @Test
    void dodajArtiklTest() {
        artikli[0] = new Artikl("Kimono", 100, "1");
        artikli[1] = new Artikl("Rukavice", 40, "2");
        artikli[2] = new Artikl("Vreca", 50, "3");
        artikli[3] = new Artikl("Bandaza", 5, "4");
        artikli[4] = new Artikl("Zubalo", 10, "5");

        for(Artikl a : artikli) {
            s.dodajArtikl(a);
        }

        for(int i = 0; i < 5; i++) {
            assertEquals(artikli[i].getNaziv(), s.getArtikli()[i].getNaziv());
            assertEquals(artikli[i].getCijena(), s.getArtikli()[i].getCijena());
            assertEquals(artikli[i].getKod(), s.getArtikli()[i].getKod());
        }
    }

    @Test
    void izbaciArtiklSaKodomTest() {
        artikli[0] = new Artikl("Kimono", 100, "1");
        artikli[1] = new Artikl("Rukavice", 40, "2");
        artikli[2] = new Artikl("Vreca", 50, "3");
        artikli[3] = new Artikl("Bandaza", 5, "4");
        artikli[4] = new Artikl("Zubalo", 10, "5");

        for(Artikl a : artikli) {
            s.dodajArtikl(a);
        }

        s.izbaciArtiklSaKodom("1");
        s.izbaciArtiklSaKodom("3");
        s.izbaciArtiklSaKodom("5");
        assertEquals("2", s.getArtikli()[0].getKod());

        assertNull(s.izbaciArtiklSaKodom("6"));
    }
}