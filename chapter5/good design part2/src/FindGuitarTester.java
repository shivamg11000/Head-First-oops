
package app;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class FindGuitarTester{
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List matchingInstruments = inventory.search(clientSpec);
        if (!matchingInstruments.isEmpty()) {
            System.out.println("User, you might like these instruments:");
            for (Iterator i=matchingInstruments.iterator() ; i.hasNext() ; ) {
                Instrument instrument = (Instrument) i.next();
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("  We have a " + spec.getProperty("instrumentType") +
                    " with the following properties:");
                for (Iterator j = spec.getProperties().keySet().iterator() ; j.hasNext() ; )  {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("instrumentType"))
                        continue;
                    System.out.println("   " + propertyName + ": " + 
                        spec.getProperty(propertyName));    
                }   
                System.out.println("  You can have this " + 
                    spec.getProperty("instrumentType") + " for $" + 
                    instrument.getPrice() + " only\n---");
            }
        }
        else {
            System.out.println("Soory, User, we have nothing for you.");
        } 
            

        
    }

    // initialize inventory
    private static void initializeInventory(Inventory inventory){
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.MAPLE);
        // a single instrument
        inventory.addInstrument("11277", 3999.95,
            new InstrumentSpec(properties));
        // more instruments....

    }
}