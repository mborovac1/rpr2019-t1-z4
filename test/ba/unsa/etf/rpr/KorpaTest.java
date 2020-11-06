package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl novi = new Artikl("Bandaza", 10, "qwd234");
        Korpa korpa = new Korpa();
        boolean dodan = korpa.dodajArtikl(novi);
        assertTrue(dodan);
    }

    @Test
    void testPuneKorpe() {
        Korpa korpa = new Korpa();
        for(int i = 0; i < 50; i++) {
            Artikl novi = new Artikl("Kimono", i + 25, String.valueOf(i));
            korpa.dodajArtikl(novi);
        }
        Artikl dodatni = new Artikl("Kimono", 100, "51");
        boolean dodan = korpa.dodajArtikl(dodatni);
        assertFalse(dodan);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        for(int i = 0; i < 5; i++) {
            Artikl novi = new Artikl("Kimono", i + 25, String.valueOf(i));
            korpa.dodajArtikl(novi);
        }
        Artikl izbaceni = korpa.izbaciArtiklSaKodom(String.valueOf(4));
        assertEquals(29, izbaceni.getCijena());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        for(int i = 0; i < 5; i++) {
            Artikl novi = new Artikl("Kimono", i + 25, String.valueOf(i));
            korpa.dodajArtikl(novi);
        }
        int ukupnaCijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(135, ukupnaCijena);
    }
}