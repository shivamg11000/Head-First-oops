package dog_doors;

// Alternate path to complete the use case
// When the dog tries to enter inside the house after the closing of door
public class DogDoorSimulator2 {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch(InterruptedException e) {}
        
        System.out.println("...but he's stuch outside!");
        System.out.println("\nFido starts barking...");
        System.out.println("...so Gina grabs the remote control.");
        remote.pressButton();
        System.out.println("\nFido's back inside...");
    }
}