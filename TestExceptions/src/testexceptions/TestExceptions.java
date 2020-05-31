
package testexceptions;

public class TestExceptions {
  public static void main(String[] args) {
      args= new String[3];
      args[0]="one";
      args[1]="two";
      args[2]="three";
      
      try{
        for ( int i = 0; true; i++ ) {
          System.out.println("args[" + i + "] is '" + args[i] + "'");
        }
      }
      catch(ArrayIndexOutOfBoundsException ex)
              {
                System.out.println("Exception caught: "+ex.getMessage());
                  System.out.println("Quiting...");
              } 
    }

    //Konstruktor domyśnlny
    public TestExceptions() {
        
        
        
        
    }
  
  
  
}