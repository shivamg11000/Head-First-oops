package app;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class Inventory{
    private List inventory;

    public Inventory() {
        inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){ 
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Iterator i = inventory.iterator() ; i.hasNext() ; ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    // polymorphism showed here
    // works for all instrument subclasses
    // for those who are not yet created also
    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList();

        for (Iterator i = inventory.iterator() ; i.hasNext() ; ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSpec().matches(searchSpec))
                matchingInstruments.add(instrument);
        }
        return matchingInstruments;
    }

} 