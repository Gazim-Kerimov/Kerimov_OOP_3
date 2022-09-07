package Items;

public class Pants extends Clothes{
    public Pants(Colors color){
        this.title = "Pants";
        this.color = color;
    }
    private Pants(){

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
