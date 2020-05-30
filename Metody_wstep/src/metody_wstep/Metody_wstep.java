package metody_wstep;

public class Metody_wstep 
{

    public static void main(String[] args) 
    {
        
      Test a = new Test();  
      a.pokazWynik("Wojtek ", "Wolinski");
      Test a2 = new Test();
      a2.pokazWynik("Andrzej", "Andrzej");
      int wynik = a.dodaj(4, 3);
      System.out.println(wynik);
      System.out.println();
      double wynikDzielenia = a.podziel(6.4, 5.4);
      System.out.println(wynikDzielenia);
      
      
       
    }
    
}
class Test
{
    
    void pokazWynik(String imie, String nazwisko)
    {
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println();
    }
    
    int dodaj(int a, int b)
    {
        return a+b;
        
    }
    double podziel(double a, double b)
    {
        if (a==0 || b==0)
            return 0;
        return a/b;
    }
}