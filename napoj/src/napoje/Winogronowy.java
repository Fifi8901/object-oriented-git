
package napoje;

public class Winogronowy extends Soki {
    String sweetness;
    public Winogronowy(){
        System.out.println("domyślny");
    }
     public Winogronowy(String marka, int pojemnosc){
        super(marka,pojemnosc);
        System.out.println("niedomyślny");
    }
    public Winogronowy(String marka,int pojemnosc,String słodycz){
        super(marka,pojemnosc);
        sweetness=słodycz;
    }
    public Winogronowy(String słodycz){
        sweetness=słodycz;
        System.out.println("Niedomyślny");
    }
    public String getsweetness(){
        return sweetness;
    }
    public void setsweetness(String słodycz){
        sweetness=słodycz;
    }
	@Override
     public void getinfo(){
        super.getinfo();
        System.out.println(sweetness);
        
    }
    
}
