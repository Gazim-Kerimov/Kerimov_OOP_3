package Humans;

import Items.Wardrobe;

public class Woman extends Person{
    private Woman(){

    }
    public Woman(String name, int age){
        this.name = name;
        this.age = age;
        this.sex = 'F';
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
        }
        else if(!wardrobe.isOpen() && this.key.getId() != wardrobe.wardrobeKey.getId()){
            System.out.println(this.name + " can't open wardrobe with wrong key");
        }
        else if(wardrobe.isOpen()){
            System.out.println("Wardrobe is already opened");
        }

    }
}
