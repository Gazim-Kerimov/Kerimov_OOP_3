package Humans;

import Items.Wardrobe;

public class Man extends Person{
    private Man(){

    }
    public Man(String name, int age){
        this.name = name;
        this.age = age;
        this.sex = 'M';
    }

    @Override
    public void close(Wardrobe wardrobe) {
        if(wardrobe.isOpen()){
            System.out.println("Wardrobe is closed now");
            wardrobe.isOpen = false;
        }
        else System.out.println("Wardrobe was closed already");
    }

    @Override
    public void open(Wardrobe wardrobe) {
        if(!wardrobe.isOpen() && this.key.getId() == wardrobe.wardrobeKey.getId()){
            System.out.println("Wardrobe is open now");
            wardrobe.isOpen = true;
        }
        else if(!wardrobe.isOpen() && this.key.getId() != wardrobe.wardrobeKey.getId()){
            System.out.println(this.name + " can't open wardrobe with wrong key");
        }
        else if(wardrobe.isOpen()){
            System.out.println("Wardrobe is already opened");
        }

    }
}
