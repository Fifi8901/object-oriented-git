package testing;

import testing.pojazdy.Pojazdy;
import testing.pojazdy.Ciezarowe;
import testing.pojazdy.Motory;
import testing.pojazdy.Samochody;
import java.util.Arrays;
import java.util.Collections;

public class Testing {

    
    public static void main(String[] args) {
        
    Ciezarowe truck1 = new Ciezarowe("MAN",20000,2017,40000);
        System.out.println("Model Samochodu Cieżarowego: "+truck1.getMarka()); 
        System.out.println("Cena pojazdu: "+truck1.getCena());
        System.out.println("Rok produkcji: "+truck1.getRocznik());
        System.out.println("Dopuszczalna całkowita masa: "+truck1.getMasa());
 
    
    Motory motorbike1 = new Motory("Honda", 15000, 2009, 600);
        System.out.println("Model Motoru: "+motorbike1.getMarka()); 
        System.out.println("Cena pojazdu: "+motorbike1.getCena());
        System.out.println("Rok produkcji: "+motorbike1.getRocznik());
        System.out.println("Pojemnosc silnika(wartość w cm3): "+motorbike1.getPojemnosc()); 
    
    
    Samochody car1 = new Samochody("Audi", 54300, 2020, "SUV");
        System.out.println("Model Samochodu Osobowego: "+car1.getMarka()); 
        System.out.println("Cena pojazdu: "+car1.getCena());
        System.out.println("Rok produkcji: "+car1.getRocznik());
        System.out.println("Rodzaj Samochodu: "+car1.getRodzaj());
    

    Ciezarowe[]ciezarowe = new Ciezarowe[5];
        ciezarowe[0]= new Ciezarowe("MAN",20000,2019,40000);
        ciezarowe[1]= new Ciezarowe("SCANIA",2,2,2);
        ciezarowe[2]= new Ciezarowe("DAV",2,2,2);
        ciezarowe[3]= new Ciezarowe("MERCEDES",2,2,2);
        ciezarowe[4]= new Ciezarowe("VOLVO",2,2,2);
        System.out.println(ciezarowe[0]);
        
        System.out.println("");
        System.out.println("");
        
        Pojazdy[]pojazdy = new Pojazdy[5];
        pojazdy[0]= new Samochody("BMW",50000, 2017, "SUV");
        pojazdy[1] = new Ciezarowe("MAN",120000, 2019, 50000); 
        pojazdy[2] = new Motory("KAWASAKI",30000,2010,600);
         pojazdy[3] = new Samochody("OPEL",100000,2020,"Sedan");
          pojazdy[4] = new Samochody("Volvo",67000,2001,"SUV");
        
       
        System.out.println("Cena samochodu osobowe marki BMW: "+pojazdy[0].getCena()+"zł");
        System.out.println("Cena pojazdu cieżarowego marki MAN: "+pojazdy[1].getCena()+"zł"); //Zadeklarowanie cen pojazdów
        System.out.println("Cena motoru marki KAWASAKI: "+pojazdy[2].getCena()+"zł");
        System.out.println("Cena pojazdu osobowego marki Opel: "+pojazdy[3].getCena()+"zł");
        System.out.println("Cena pojazdu osobowego marki Volvo: "+pojazdy[4].getCena()+"zł");
        
        Arrays.sort(pojazdy); //Zadeklarowanie i sortowanie cen pojazdów rosnąco
        System.out.println("");
        System.out.println("Podane ceny Pojazdów według cen rosnąco");
        
        System.out.println("Cena samochodu osobowe marki BMW: "+pojazdy[0].getCena()+"zł");
        System.out.println("Cena pojazdu cieżarowego marki MAN: "+pojazdy[1].getCena()+"zł"); 
        System.out.println("Cena motoru marki KAWASAKI: "+pojazdy[2].getCena()+"zł");
        System.out.println("Cena pojazdu osobowego marki Opel: "+pojazdy[3].getCena()+"zł");
        System.out.println("Cena pojazdu osobowego marki Volvo: "+pojazdy[4].getCena()+"zł");
        
        
        
        Arrays.sort(pojazdy, Collections.reverseOrder()); //Zadeklarowanie i sortowanie cen pojazdów malejąco
        System.out.println("");
        System.out.println("Podane ceny Pojazdów według cen malejących");
        
        System.out.println("Cena samochodu osobowe marki BMW: "+pojazdy[0].getCena()+"zł");
        System.out.println("Cena pojazdu cieżarowego marki MAN: "+pojazdy[1].getCena()+"zł"); 
        System.out.println("Cena motoru marki KAWASAKI: "+pojazdy[2].getCena()+"zł");
        System.out.println("Cena pojazdu osobowego marki Opel: "+pojazdy[3].getCena()+"zł");
        System.out.println("Cena pojazdu osobowego marki Volvo: "+pojazdy[4].getCena()+"zł");

        
        
        
        
        
        
        
        
    }
    
}
