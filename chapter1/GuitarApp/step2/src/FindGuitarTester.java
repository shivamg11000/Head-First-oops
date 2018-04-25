
package app;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class FindGuitarTester{
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatUserLikes = new GuitarSpec(Builder.FENDER,
                                          "Stratocastor", Type.ELECTRIC, 
                                          Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatUserLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("User, you might like these guitars:");
            for (Iterator i=matchingGuitars.iterator() ; i.hasNext() ; ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec guitarSpec = guitar.getSpec();
                System.out.println("  We have a " +
                    guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                    guitarSpec.getType() + " guitar:\n    with " + 
                    guitarSpec.getBackWood() + " back and sides,\n    " + 
                    guitarSpec.getTopWood() + " top.\n  You can have it for only $" +
                    guitar.getPrice() + "!\n----");
            }
        }
        else {
            System.out.println("Soory, User, we have nothing for you.");
        } 
            

        
    }

    // initialize inventory
    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("0", 2000, new GuitarSpec(Builder.FENDER,
                            "b", Type.ELECTRIC, Wood.MAPLE,
                            Wood.CEDAR));
        inventory.addGuitar("1", 5000, new GuitarSpec(Builder.MARTIN,
                            "b", Type.ELECTRIC, Wood.CEDAR,
                            Wood.MAPLE));                    
        inventory.addGuitar("2", 1000, new GuitarSpec(Builder.GIBSON,
                            "basd", Type.ACOUSTIC, Wood.MAPLE,
                            Wood.CEDAR));
        inventory.addGuitar("3", 9000, new GuitarSpec(Builder.FENDER,
                            "b", Type.ACOUSTIC, Wood.CEDAR,
                            Wood.CEDAR));
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER,
                            "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                            Wood.ALDER));                     
        inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER,
                            "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                            Wood.ALDER));

    }
}