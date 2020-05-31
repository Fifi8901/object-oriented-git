package tablice_wielowymiarowe;

public class Tablice_wielowymiarowe 
{

    public static void main(String[] args) 
    {
        int[][] tab1 = new int[5][4];
        tab1[2][3] = 15;
        
        System.out.println(tab1[2][3]);
        
        //odczytujemy najpierw wierszami, potem kolumnami
        int[][] tab2 = 
        {
                {4,5,6,7,8,12},
                {62,12,13,43,12,7},
                {54,43,56,78,90,91},
                {123, 124, 56, 89, 10, 20},
                {98, 87, 65, 47, 82, 19},
                {10, 20, 30, 40, 50, 60},
                                    
       };
        System.out.println(tab2[3][3]);
    }
    
    
    
}
