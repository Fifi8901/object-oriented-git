package instrukcja_switch;

public class Instrukcja_switch 
{

    public static void main(String[] args) 
    {
        /* Switch - przełącznik
        możemy porówynywać ze sobą inty oraz chary, nie możemy stringów, double-ów
        
        */
      int a=210;
      
      switch (a)
      {
          case 10:
              System.out.println("a jest równe 10");
              break;
          case 20:
              System.out.println("a jest równe 20");
              break;
          default:
              System.out.println("A nie jest równe ani 10, ani 20");
              System.out.println("A jest równe:"+ " "+ a);
      }
    }
    
}
