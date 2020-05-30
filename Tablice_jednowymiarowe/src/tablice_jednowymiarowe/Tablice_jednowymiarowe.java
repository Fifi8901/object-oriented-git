package tablice_jednowymiarowe;

public class Tablice_jednowymiarowe 
{

    public static void main(String[] args) 
    {
        /*
           -------------------------------
           tab[0]  tab[1]  tab[2]  tab[3]
        
           -------------------------------
        */
        
        //int[] tab
        //new tab = int[5]
        
        
        int[] tab = new int[5];     //szybszy sposób
        tab[0] = 4;
        tab[1] = 5;
        tab[2] = 3;
        tab[3] = 45;
        tab[4] = 60;
       
        System.out.println(tab[4]);
        
        int[] tab2 = {2, 4, 6, 10, 22};
        
        System.out.println(tab2[3]);
        System.out.println(tab2[tab2.length-1]); //gdy chcemy dostać się do ostatniego elementu tablicy
    }
    
}
