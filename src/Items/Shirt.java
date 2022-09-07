package Items;

public class Shirt extends Clothes{
    public Shirt(Colors color){
        this.title = "Shirt";
        this.color = color;
    }
    private Shirt(){

    }

    @Override
    public Colors getColor() {
        return super.getColor();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }
}
