
package dziedziczenie.potwory;
import dziedziczenie.potwory.Potwor;

public class Pajak extends Potwor
{
    
    private String size;
    public Pajak()
    {
        System.out.println("Wywołano domyślny konstruktor z klasy Pająk");
    }
    public Pajak(double movementSpeed, double HP)
    {
        
        super(movementSpeed, HP);
        System.out.println("Niedomyślny konstruktor z klasy Pajak");
        
    }
    public Pajak(double movementSpeed, double HP, String size)
    {
        
        super(movementSpeed, HP);
        System.out.println("Niedomyślny konstruktor z klasy Pająk, z rozmiarem");
        this.size = size;
    }
    public String getSize()
    {
        System.out.println("Rozmiar pająka to: "+size);
        return size;
        
    }

    @Override
     public void attack()
    {
        super.attack();
        /*
           DODATKOWE INSTRUKCJE UNIKALNE DLA PAJAKA
        */
        System.out.println("To jest metoda atakuj z klasy Pajak");
        
        
    }

  

    @Override
    protected void opis() 
    {
        
    }
}

