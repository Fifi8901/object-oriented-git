package testing.pojazdy;

public class Ciezarowe extends Pojazdy  {
   
 
    private double dopuszczalna_masa_calkowita;
    public Ciezarowe() {
        System.out.println("Default");   //Konstruktor domyślny
    }

    public Ciezarowe(String marka, int cena, int rocznik, double dopuszczalna_masa_calkowita ) {
        super(marka,cena,rocznik);
        this.dopuszczalna_masa_calkowita= dopuszczalna_masa_calkowita;
        System.out.println("");
        System.out.println("Dodano nowy pojazd ciężarowy");
    }

    public double getMasa() {
        return dopuszczalna_masa_calkowita;
    }                                                                           //metody GET oraz SET

    public void setPojemnosc(double dopuszczalna_masa_calkowita) {
        this.dopuszczalna_masa_calkowita = dopuszczalna_masa_calkowita;
    }

    
   
}

