package testing.pojazdy;

public class Samochody extends Pojazdy {

    private String rodzaj;
    public Samochody() {
        System.out.println("Default");   //Konstruktor domyślny
    }

    public Samochody(String marka, int cena, int rocznik, String rodzaj ) {
        super(marka,cena,rocznik);
        this.rodzaj = rodzaj;
        System.out.println("");
        System.out.println("Dodano nowy pojazd osobowy");
    }

    public String getRodzaj() {
        return rodzaj;
    }                                                //metody GET oraz SET

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
}

