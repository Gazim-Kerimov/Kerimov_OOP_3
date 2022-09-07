package Items;

import java.util.Random;

public class Key {
    double id;
    public Key(){
        this.id =  Math.random() * (100 - 1) + 1;
    }

    public double getId() {
        return id;
    }
}
