
package dziedziczenie.potwory;

public class Szkielet extends Potwor

        
{
    private String weaponType;
    public Szkielet()
    {
        System.out.println("Wywołano domyślny konstruktor z klasy Szkielet");
    }
    public Szkielet(double movementSpeed, double HP)
    {
        
        super(movementSpeed, HP);
        System.out.println("Niedomyślny konstruktor z klasy szkielet");
        
    }
    public Szkielet(double movementSpeed, double HP, String weaponType)
    {
        
        super(movementSpeed, HP);
        System.out.println("Niedomyślny konstruktor z klasy szkielet, z typem broni");
        this.weaponType = weaponType;
    }
    public String getWeaponType()
    {
        System.out.println("Typ broni szkieleta to: "+weaponType);
        return weaponType;
    }

    @Override
     public void attack()
    {
        super.attack();
        /*
           DODATKOWE INSTRUKCJE UNIKALNE DLA SZKIELETA
        */
        System.out.println("To jest metoda atakuj z klasy Szkielet");
        
    }

    @Override
    protected void opis() 
    {
        
    }


}
