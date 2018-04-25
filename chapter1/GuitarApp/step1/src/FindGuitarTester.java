
package app;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class FindGuitarTester{
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatUserLikes = new Guitar("", 0 , Builder.FENDER,
                                          "Stratocastor", Type.ELECTRIC, 
                                          Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatUserLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("User, you might like these guitars:");
            for (Iterator i=matchingGuitars.iterator() ; i.hasNext() ; ) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("  We have a " +
                    guitar.getBuilder() + " " + guitar.getModel() + " " +
                    guitar.getType() + " guitar:\n    with " + 
                    guitar.getBackWood() + " back and sides,\n    " + 
                    guitar.getTopWood() + " top.\n  You can have it for only $" +
                    guitar.getPrice() + "!\n----");
            }
        }
        else {
            System.out.println("Soory, User, we have nothing for you.");
        } 
            

        
    }

    // initialize inventory
    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("0", 2000, Builder.FENDER,
                            "b", Type.ELECTRIC, Wood.MAPLE,
                            Wood.CEDAR);
        inventory.addGuitar("1", 5000, Builder.MARTIN,
                            "b", Type.ELECTRIC, Wood.CEDAR,
                            Wood.MAPLE);                    
        inventory.addGuitar("2", 1000, Builder.GIBSON,
                            "basd", Type.ACOUSTIC, Wood.MAPLE,
                            Wood.CEDAR);
        inventory.addGuitar("3", 9000, Builder.FENDER,
                            "b", Type.ACOUSTIC, Wood.CEDAR,
                            Wood.CEDAR);
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER,
                            "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                            Wood.ALDER);                     
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER,
                            "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                            Wood.ALDER);

    }
}