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

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i] = null;
                for(int j = i; j < brojArtikala; j++) {
                    artikli[j] = artikli[j + 1];
                }
                artikli[brojArtikala] = null;
                brojArtikala = brojArtikala - 1;
                return temp;
            }
        }

        return null;
    }

}
