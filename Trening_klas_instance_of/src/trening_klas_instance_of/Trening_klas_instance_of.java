package trening_klas_instance_of;


abstract class Osoba 
{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    
    
   
}
class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
       
    }

  
  
}
class Pracownik extends Osoba
{
    Pracownik(String imie, String nazwisko, double wynagrodzenie )
    {
        super(imie, nazwisko);
        this.wynagrodzenie=wynagrodzenie;
     
    }
    double wynagrodzenie;

   
}

public class Trening_klas_instance_of 
{

    public static void main(String[] args) 
    {
        Osoba[]osoby=new Osoba[5];
        osoby[0]=new Student("Filip","Stelmański");
        osoby[1]=new Pracownik("Andrzej","Jakiśtam",1000.2);
        for(Osoba person:osoby)