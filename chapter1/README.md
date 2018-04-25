
// Enum Data types
1. Type
2. Wood
3. Builder

// main
-> FindGuitarTester

## Three steps to great software
    1. Achieve functionality adhering to the customers needs
    2. Apply basic Object Oriented Principles to add flexibility
    3. Strive for a maintable, reusable design


### *step1*
    -> A functionality to have enquiry of guitar on given specs

### *step2*
    -> here the specs of guitar were encapsulated from guitar class into a new class guitarSpec

*** *Encapsulation* ***

   1. allows you to group your application into logical parts 
   2. Also about breaking the app into logical parts and keeping those parts separate.
   3. Anytime you see duplicate code, look for a place to encapsulate
   4. Less coupling

### *step3*
    1. Here a new property "numStrings" representing number of strings in a guitar
    is added to guitarSpec class
    2. The change to guitarSpec was causing other class to break -> Inventory's search() method 
    3. A software desing is not good if one module causes other module to break.
    4. So as a solution, the search method logic was separated and moved to guitarSpec methods. This process is called delegation.
    5. In this way, whenever a new property is added to guitarSpec, the code only in the guitarSpec is changed without affecting other
    classes or modules to break/modify.

*** *Delegation* *** 

The act of one object forwarding an operation to another object, to be performed on behalf of the first object