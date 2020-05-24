
package napoje;

public class Soki implements Comparable<Soki> {
    
     String marka;
     int pojemnosc;
    
    public Soki(){
        System.out.println("domyślny");
    }
    public Soki(String brand, int capacity){
        marka=brand;
        pojemnosc=capacity;
        
    }
    public String getmarka(){
        return marka;
    }
    public int getpojemnosc(){
        return pojemnosc;
    }
    public void setmarka(String brand){
        marka=brand;
    }
    public void setpojemnosc(int capacity){
        pojemnosc=capacity;
    }
    public void getinfo(){
        System.out.println(marka);
        System.out.println(pojemnosc);
    }
    
     @Override
    public int compareTo(Soki o){
        return this.marka.compareTo(o.marka);
    }

   
    
}
