import Humans.Man;
import Items.*;

public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("John", 30);
        Key key1 = new Key();
        Wardrobe wardrobe1 = new Wardrobe(2,key1);
        man1.getKey(new Key());
        man1.addClothes(wardrobe1, new Pants(Colors.RED));
        man1.open(wardrobe1);
        man1.getKey(key1);
        man1.open(wardrobe1);
        man1.addClothes(wardrobe1, new Shirt(Colors.GREEN));
        man1.addClothes(wardrobe1, new Shirt(Colors.BLACK));
        man1.close(wardrobe1);
    }
}
