
package dziedziczenie.potwory;

   
   public abstract class Potwor implements Comparable   {
    private double movementSpeed = 10;
    private double HP;
   
   public Potwor()
   {
       System.out.println("Domyslny konsktruktor z klasy potwor");
   }
    public Potwor(double movementSpeed, double HP)
   {
       System.out.println("Niedomyślny konstruktor z klasy potwor");
       this.movementSpeed = movementSpeed;
       this.HP = HP;
   }
   
   public double getHP()
   {
       System.out.println("Zwrocono HP"+" "+HP);
       return HP;
   }
   public double getmovementSpeed()
   {
       System.out.println("Zwrocono MS"+" "+movementSpeed);
       return movementSpeed;
   }
    @Override
     public String toString() 
    {
        System.out.println(getClass());
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    public void attack()
    {
        /*
           BAZOWE INSTRUKCJE
        */
        System.out.println("To jest metoda atakuj z klasy Potwor");
    }
   
    
    abstract protected void opis();

    @Override
    public int compareTo(Object t) 
    {
        Potwor przyslany = (Potwor)t;
        if(this.HP < przyslany.HP)
        return -1;
        
        else if(this.HP> przyslany.HP)
        return 1;
        
        
         return 0;
    }
    
}
