
package napoje;

public class Pomaranczowy extends Soki {
    String amountofpulp;
    public Pomaranczowy(){
        System.out.println("domyślny");
    }
    public Pomaranczowy(String miąższ){
        amountofpulp=miąższ;
        System.out.println("Niedomyślny");
    }
    
    public Pomaranczowy(String marka, int pojemnosc){
        super(marka,pojemnosc);
        System.out.println("niedomyślny");
    }
    public Pomaranczowy(String marka,int pojemnosc,String miąższ){
        super(marka,pojemnosc);
        amountofpulp=miąższ;
        System.out.println("niedomyślny");
    }
  @Override
    public void getinfo(){
        super.getinfo();
        System.out.println(amountofpulp);
    }
	
    public void setamountofpulp(String miąższ){
        amountofpulp=miąższ;
    }
    
}
