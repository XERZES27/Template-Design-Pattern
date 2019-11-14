
package templetennew;

    

public class bar extends store{
    
    String[] items = { "beer,", "wine,", "Alchol,","coca,","water" };
    String[] takeout = { "beer,","wine" };
    
    boolean employeewantingrdent() { return false; }
    
    @Override
    void listItem() {
        
        System.out.print("Items: ");

        for (String item : items){

            System.out.print(item + " ");

        }
    }

    @Override
    void takeOutDrink() {
        
         System.out.print("Take out drinks: ");

        for (String Takeout : takeout){

            System.out.print(Takeout + " ");

        }
        
    }
    @Override
    void takeoutIngrident() {
        
    }
    

    @Override
    void takeoutAmount() {
         System.out.print("Take out amount:20pices,40pices ");

        
        
    }
   
    
}
