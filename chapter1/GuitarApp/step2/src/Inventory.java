package app;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class Inventory{
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        Guitar guitar = new Guitar(serialNumber, price, spec);                              
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator() ; i.hasNext() ; ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitarSpec) {
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator() ; i.hasNext() ; ) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();

            if (searchGuitarSpec.getBuilder() != guitarSpec.getBuilder()) 
                continue;
            String model = searchGuitarSpec.getModel().toLowerCase();    
            if ((model != null) && (!model.equals("")) && 
                (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            if (searchGuitarSpec.getType() != guitarSpec.getType())
                continue;
            if (searchGuitarSpec.getBackWood() != guitarSpec.getBackWood())
                continue;
            if (searchGuitarSpec.getTopWood() != guitarSpec.getTopWood())
                continue;
            matchingGuitars.add(guitar);
        }   
        return matchingGuitars;
    }

} 