package Humans;

import Items.Clothes;
import Items.Key;
import Items.Wardrobe;

public abstract class Person implements Open, Close{
    String name;
    char sex;
    int age;
    Key key;
    public void getKey(Key k){
        this.key = k;
    }

    public void addClothes(Wardrobe w, Clothes c){
        int perm = 0;
        if(w.isOpen()){
            for(int i = 0; i < w.clothes.length; i++){
                if(w.clothes[i]== null){
                    w.clothes[i] = c;
                    System.out.println(c.getColor() + " " + c.getTitle() + " is in wardrobe now");
                    break;
                }
                else perm++;
            }
            if(perm == w.clothes.length){
                System.out.println("No empty place in wardrobe for " + c.getColor() + " " + c.getTitle());
            }
        }
        else System.out.println("Wardrobe is closed. You should open it first");
    }



}
