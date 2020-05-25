package testing.pojazdy;

public class Pojazdy implements Comparable {

    private String marka;
    private int cena;
    private int rocznik;

    public Pojazdy() {
        System.out.println("Default");   //Konstruktor domyślny
    }


    public Pojazdy(String marka, int cena, int rocznik) {
        this.marka = marka;
        this.cena = cena;
        this.rocznik = rocznik;
        System.out.println("");
        System.out.println("");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public int getCena() {
        return cena;
    }                                                             //metody GET oraz SET

    public void setCena(int cena) {
        this.cena = cena;
    }


    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }



    @Override
    public String toString() {
        return "Pojazdy{" +
                "marka='" + marka + '\'' +     //użycie toString
                ", cena=" + cena +
                ", rocznik=" + rocznik +
                '}';
    }

    @Override
    public int compareTo(Object t) 
    {
       Pojazdy send = (Pojazdy)t;
       if(this.cena < send.cena)
        return -1;                     //interfejsy porównujący cene obiektów
        
        else if(this.cena> send.cena)
        return 1;
        
        
         return 0;
    }
    
}

