
package templetennew;


public  abstract class store {
    
      
    final void takeOut(){

        start();

        if(employeewantslist()){
        
            listItem();        
        }

        if(employeewantdrink()){
          System.out.println("");
            takeOutDrink();

       }

        if(employeewantingrdent()){
        System.out.println(" ");
            takeoutIngrident();

        }
        System.out.println("");
        if(employeewantamount()){

            takeoutAmount();
        }

        end();

    }
    
    abstract void listItem();
    abstract void takeOutDrink();
    abstract void takeoutIngrident();
    abstract void takeoutAmount();
    
    public void start(){

        System.out.println("start take out:");

    }

   

    boolean employeewantslist() { return true; }
    boolean employeewantdrink() { return true; }
    boolean employeewantingrdent() { return true; }
    boolean employeewantamount() { return true; }

    public void end(){

        System.out.println("\nend take out.");

    }

  
    
}
