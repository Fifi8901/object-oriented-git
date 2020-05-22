
package dziedziczenie.potwory;


public class Zombie extends Potwor
{
    private String brainlessness;
    public Zombie()
    {
        System.out.println("Wywołano domyślny konstruktor z klasy Zombie");
    }
      public Zombie(double movementSpeed, double HP)
    {
        
        super(movementSpeed, HP);
        System.out.println("Niedomyślny konstruktor z klasy zombie");
        
    }
    public Zombie(double movementSpeed, double HP, String brainlessness)
    {
        
        super(movementSpeed, HP);
        System.out.println("Niedomyślny konstruktor z klasy zombie, z poziomem głupoty");
        this.brainlessness = brainlessness;
        
    }
    public String getBrainlessness()
    {
        System.out.println("Poziom głupoty tego zombie to: "+brainlessness);
        return brainlessness;
        
    }
 
      @Override
     public void attack()
    {
        super.attack();
        /*
           DODATKOWE INSTRUKCJE UNIKALNE DLA SZKIELETA
        */
        System.out.println("To jest metoda atakuj z klasy Zombie");
        
    }
   
    @Override
    protected void opis() 
    {
        
    }
}

