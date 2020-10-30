package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private static int brojArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala > 49) {
            // throw new Exception("Dostignut maksimalan broj artikala u supermarketu");
            return false;
        }
        else {
            artikli[brojArtikala] = a;
            brojArtikala = brojArtikala + 1;
            return true;
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocni = new Artikl("pomocni", 1, "pomocni");

        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)) {
                pomocni = artikli[i];
                artikli[i] = null;
                for(int j = i; j < brojArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
                brojArtikala = brojArtikala - 1;
                // ne mora i-- jer piše u tekstu zadatka da su svi kodovi artikala različiti ... možemo odma break petlju
                break;
            }
        }

        return pomocni;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < brojArtikala; i++) {
            suma = suma + artikli[i].getCijena();
        }
        return suma;
    }

}
