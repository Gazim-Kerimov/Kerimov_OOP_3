package Items;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    public Clothes[] clothes;
    public int wardrobeSize;
    public Key wardrobeKey;
    public boolean isOpen = false;
    private Wardrobe(){

    }
    public Wardrobe(int size, Key key){
        clothes = new Clothes[size];
        this.wardrobeSize = size;
        this.wardrobeKey = key;
    }
    public boolean isOpen(){
        return isOpen;
    }

    
}
