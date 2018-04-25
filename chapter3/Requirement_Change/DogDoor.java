package dog_doors;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;

    public DogDoor(){
        this.open = false;
    }
    
    public void open() { // automatically shuts after a few secs
        System.out.println("The dog door opens.");
        this.open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }
}