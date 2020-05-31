package butelka_new;

public class Butelka_new
{

double ileLitrow;
double pojemnoscButelki;
static int ileButelek=50;
double gdziePrzelac;





Butelka_new()
{
    ileLitrow=10;
    pojemnoscButelki=20;
}
    
 Butelka_new(double ileLitrow, double pojemnoscButelki)
     {
        this.ileLitrow+=ileLitrow;
        this.pojemnoscButelki+=pojemnoscButelki;
     }
  void wlej(double ilosc)
 {
     if(ileLitrow+ilosc>pojemnoscButelki)
     {
         System.out.println("Nalałem na maxa. Zostało:  "+(ilosc-(pojemnoscButelki-ileLitrow)));
         ileLitrow+=(pojemnoscButelki-ileLitrow);
      }
     
     else
     {
     this.ileLitrow+=ilosc;
     }
     

 }
  void wylej(double ilosc)
 {
     if(ilosc>ileLitrow)
     {
         this.ileLitrow-=ileLitrow;
         System.out.println("Więcej z niej się nie da wylać");
         
     }
     else
     {
     this.ileLitrow-=ilosc;
     }
     
     
 }
 
   void przelej (double ilosc, Butelka_new gdziePrzelac)
   {

       
       this.wylej(ilosc);
       gdziePrzelac.wlej(ilosc);
       
       
      
   }

    public static void main(String[] args) 
    {
        
       Butelka_new[]butelka = new Butelka_new[ileButelek];
       for(int i=0; i<ileButelek; i++)
       {
           if(i%2!=0)
           {
               butelka[i] = new Butelka_new (12, 40);
           }
           else if (i%3!=0)
           {
               butelka[i]= new Butelka_new (8, 12.4);
           }
           else
               
            butelka[i] = new Butelka_new();
          
       }
        System.out.println(butelka[1].ileLitrow+ " "+ butelka[1].pojemnoscButelki);
        System.out.println(butelka[2].ileLitrow+ " "+ butelka[2].pojemnoscButelki);
        butelka[1].przelej(11, butelka[2]);
        System.out.println(butelka[1].ileLitrow+ " "+ butelka[1].pojemnoscButelki);
        System.out.println(butelka[2].ileLitrow+ " "+ butelka[2].pojemnoscButelki);
        butelka[1].wylej(50);
        System.out.println(butelka[1].ileLitrow+ " "+ butelka[1].pojemnoscButelki);
        butelka[1].wlej(45);
        System.out.println(butelka[1].ileLitrow+ " "+ butelka[1].pojemnoscButelki);
       
      
      
    }

    public Butelka_new(double ileLitrow, double pojemnoscButelki, double gdziePrzelac) {
        this.ileLitrow = ileLitrow;
        this.pojemnoscButelki = pojemnoscButelki;
        this.gdziePrzelac = gdziePrzelac;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

    public void setIleLitrow(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }

    public double getPojemnoscButelki() {
        return pojemnoscButelki;
    }

    public void setPojemnoscButelki(double pojemnoscButelki) {
        this.pojemnoscButelki = pojemnoscButelki;
    }

    public static int getIleButelek() {
        return ileButelek;
    }

    public static void setIleButelek(int ileButelek) {
        Butelka_new.ileButelek = ileButelek;
    }

    public double getGdziePrzelac() {
        return gdziePrzelac;
    }

    public void setGdziePrzelac(double gdziePrzelac) {
        this.gdziePrzelac = gdziePrzelac;
    }

    @Override
    public String toString() {
        return "Butelka{" + "ileLitrow=" + ileLitrow + ", pojemnoscButelki=" + pojemnoscButelki + ", gdziePrzelac=" + gdziePrzelac + '}';
    }
    
    
    
    
  
    

    
}

