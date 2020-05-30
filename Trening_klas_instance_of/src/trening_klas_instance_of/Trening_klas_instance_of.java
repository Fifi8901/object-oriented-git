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

<<<<<<< HEAD
=======
<<<<<<< HEAD
  
  
=======
>>>>>>> 5782595b69927f9f6f63d588615dd2b16f0774a6
    @Override
    void getInfo() 
    {
        System.out.println("Jestem studentem");
        System.out.println("Mam na imie: "+imie);
        System.out.println("Mam na nazwisko: "+nazwisko);
    }
    void learn()
    {
        System.out.println("Ucze się przecież");
    }
<<<<<<< HEAD
=======
>>>>>>> ab81815d7f1b3ac543e7a60caccf8756af370ec0
>>>>>>> 5782595b69927f9f6f63d588615dd2b16f0774a6
}
class Pracownik extends Osoba
{
    Pracownik(String imie, String nazwisko, double wynagrodzenie )
    {
        super(imie, nazwisko);
        this.wynagrodzenie=wynagrodzenie;
     
    }
    double wynagrodzenie;

<<<<<<< HEAD
=======
<<<<<<< HEAD
   
=======
>>>>>>> 5782595b69927f9f6f63d588615dd2b16f0774a6
    @Override
    void getInfo() 
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Mam na imie: "+imie);
        System.out.println("Mam na nazwisko: "+nazwisko);
        System.out.println("zarabiam: "+wynagrodzenie);
    }
    void pracuj()
    {
        System.out.println("Pracuje se");
    }
<<<<<<< HEAD
=======
>>>>>>> ab81815d7f1b3ac543e7a60caccf8756af370ec0
>>>>>>> 5782595b69927f9f6f63d588615dd2b16f0774a6
}

public class Trening_klas_instance_of 
{

    public static void main(String[] args) 
    {
        Osoba[]osoby=new Osoba[5];
        osoby[0]=new Student("Filip","Stelmański");
        osoby[1]=new Pracownik("Andrzej","Jakiśtam",1000.2);
<<<<<<< HEAD
=======
<<<<<<< HEAD
        for(Osoba person:osoby)
=======
>>>>>>> 5782595b69927f9f6f63d588615dd2b16f0774a6
        for(Osoba person:osoby)
        {
            if(person instanceof Pracownik)
            {
             Pracownik tmp = ((Pracownik)person);
             tmp.getInfo();
             tmp.pracuj();
//            ((Pracownik)person).getInfo();
//            ((Pracownik)person).pracuj();
            
            }
            else if(person instanceof Student)
            {
                Student tmp = ((Student)person);
                tmp.learn();
                tmp.getInfo();
//                ((Student)person).getInfo();
//                ((Student)person).learn();
//                
            }
                
        }
        
    }
    
<<<<<<< HEAD
}
=======
}
>>>>>>> ab81815d7f1b3ac543e7a60caccf8756af370ec0
>>>>>>> 5782595b69927f9f6f63d588615dd2b16f0774a6
