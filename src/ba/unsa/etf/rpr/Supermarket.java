package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private static int brojArtikala = 0;

    public boolean dodajArtikl(Artikl a){
        if(brojArtikala > 999) {
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

}
