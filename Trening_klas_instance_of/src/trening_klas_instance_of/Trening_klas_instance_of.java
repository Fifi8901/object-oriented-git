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
    
    abstract void getInfo();
   
public class Trening_klas_instance_of 
{

    public static void main(String[] args) 
    {
        Osoba[]osoby=new Osoba[5];
        osoby[0]=new Osoba("Filip","Stelmański");
        osoby[1]=new Osoba("Andrzej","Jakiśtam");