
package napoje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Napoje {

    public static void main(String[] args) {

        Winogronowy sok;
        sok = new Winogronowy();
        sok.setsweetness("duża");
        System.out.println(sok.getsweetness());
        Soki sok2;
        sok2 = new Pomaranczowy("Cappy",50,"Dużo");
        System.out.println(sok2.getmarka());
        sok2.setmarka("Caprio");
        sok2.getinfo();
        System.out.println("");System.out.println("");
        
        Soki[] juice = new Soki[3];
        juice[0]=new Winogronowy("bardzo słodki");
        juice[0].setmarka("Fortuna");
        juice[0].setpojemnosc(2);
        juice[0].getinfo();
        System.out.println("");
        juice[1]=new Pomaranczowy("malutko");
        juice[1].setmarka("Tymbark");
        juice[1].setpojemnosc(4);
        juice[1].getinfo();
        System.out.println("");
        
        juice[2]=new Winogronowy("kwaśny");
        juice[2].setmarka("Riviva");
        juice[2].setpojemnosc(1);
        juice[2].getinfo();
        System.out.println("");
        System.out.println("");
        
        List<Soki>juice2=new ArrayList<>();
        juice2.add(new Winogronowy("Tymbark",3,"całkiem słodki"));
        juice2.add(new Pomaranczowy("Fortuna",4,"dużo"));
        juice2.add(new Pomaranczowy("Garden",5,"sam miąższ"));
        
        System.out.println(juice2.get(0).marka);
        System.out.println(juice2.get(1).marka);
        System.out.println(juice2.get(2).marka);
        
        System.out.println("");System.out.println("");
        
        	
        Collections.sort(juice2);
        System.out.println(juice2.get(0).marka);
        System.out.println(juice2.get(1).marka);
        System.out.println(juice2.get(2).marka);
        
        
        System.out.println("");System.out.println("");
        Collections.reverse(juice2);
         System.out.println(juice2.get(0).marka);
        System.out.println(juice2.get(1).marka);
        System.out.println(juice2.get(2).marka);
        
        
              

             
            
        
        

        
        
        
        
        
       
    }
    
}
