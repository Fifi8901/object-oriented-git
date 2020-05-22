
package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;
import dziedziczenie.potwory.Pajak;
import java.util.Arrays;
import java.util.Collections;

public class Dziedziczenie {

   
    public static void main(String[] args) 
    
    {
//        Potwor p = new Potwor(10, 100);
//        p.attack();
//        p.getHP();
//        p.getmovementSpeed();
//        Klasa abstrakcyjna, nie można utworzyć bezpośrednio instancji klasy Potwor, natomiast możemy za pomocą klasy abstract tworzyć instancje innych potworów
      
        Szkielet s = new Szkielet(50, 40, "łuk");             //Najpierw wywołuje konstruktor z klasy potwór, dopiero potem z klasy szkielet, z typem broni
        System.out.println();
        System.out.println();
        System.out.println("SZKIELET");
        s.getmovementSpeed();
        s.getHP();
        s.attack();                                          //Podobnie przy ataku, atak bazowy z klasy potwór, później dodaje dodatkowe instrukcje unikalnie dla szkieleta
        s.getWeaponType();
        s.toString();
       
        
        
        
        System.out.println();
        System.out.println();
        System.out.println("ZOMBIE");
        Zombie z = new Zombie(20, 30, "hard");              //Najpierw wywołuje konstruktor z klasy potwór, dopiero potem z klasy zombie, z poziomem głupoty
        System.out.println();
        System.out.println();
        z.getHP();
        z.getmovementSpeed();
        z.getBrainlessness();
        z.attack();                                            //Podobnie przy ataku, atak bazowy z klasy potwór, później dodaje dodatkowe instrukcje unikalnie dla zombie
        z.toString();
        
        
        
        System.out.println();
        System.out.println();
        System.out.println("PAJAK");
        Pajak pj = new Pajak(50, 60, "small");            //Najpierw wywołuje konstruktor z klasy potwór, dopiero potem z klasy pająk, z rozmiarem
        System.out.println();
        System.out.println();
        pj.getHP();
        pj.getmovementSpeed();
        pj.getSize();
        pj.attack();                                     //Podobnie przy ataku, atak bazowy z klasy potwór, później dodaje dodatkowe instrukcje unikalnie dla pająka
        pj.toString();
        
       
        System.out.println();
        System.out.println();
        System.out.println("Tworzenie szkieleta z wykorzystaniem klasy abstrakcyjnej Potwór");
        Potwor s2 = new Szkielet(50, 40);
        s2.attack();
        s2.toString();                                    //Zostaje wywołana metoda, która została zdefiniowana w klasie abstract Potwor, jednak dziedziczy ją w tym przypadku szkielet
        
        System.out.println();
        System.out.println();
        System.out.println("Tworzenie pajaka z wykorzystaniem klasy abstrakcyjnej Potwór");
        Potwor pj2 = new Pajak(100, 100, "big");
        pj2.attack();                                    //Zostaje wywołana metoda, która została zdefiniowana w klasie abstract Potwor, jednak dziedziczy ją w tym przypadku pająk
        pj2.toString();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
           
        
        Potwor[]potwory = new Potwor[6];
        potwory[0]= new Szkielet(100, 150, "miecz");
        potwory[1]= new Zombie(50, 220, "low");
        potwory[2] = new Pajak(140, 250, "huge");
        potwory[3]= new Szkielet(80, 240, "tarcza");
        potwory[4]= new Zombie(80, 140, "hard");
        potwory[5] = new Pajak(155, 15, "small");
        System.out.println("");
        System.out.println("Przed sortowaniem: ");
        for(Potwor p: potwory)
        {
            p.getHP();
           
        }
        System.out.println("");
        System.out.println("Po sortowaniu: ");
        Arrays.sort(potwory);
        for(Potwor p: potwory)
        {
            p.getHP();
           
        }
        System.out.println("");
        System.out.println("Po sortowaniu odwrotnym: ");
        Arrays.sort(potwory, Collections.reverseOrder());
        for(Potwor p: potwory)
        {
            p.getHP();
           
        }
        
        
    }
    
    
    
     void metoda(Potwor potwor)
        {
            
        }
    
    
}
