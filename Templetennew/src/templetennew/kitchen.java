
package templetennew;


public class kitchen extends store {
    
    String[] items = { "onion,", "tomato,", "carrot,","oil,","salt" };
    String[] takeout = { "onion,","tomato" };
    
     boolean employeewantdrink() { return false; }
    @Override
    void listItem() {
        
        System.out.print("Items: ");

        for (String item : items){

            System.out.print(item + " ");

        }
    }

    @Override
    void takeOutDrink() {
      
    }

    @Override
    void takeoutIngrident() {
        System.out.print("Take out ingrident: ");

        for (String Takeout : takeout){

            System.out.print(Takeout + " ");

        }
        
    }

    @Override
    void takeoutAmount() {
         System.out.print("Take out amount:12kg,40kg ");

        
        
    }

   
    
}
