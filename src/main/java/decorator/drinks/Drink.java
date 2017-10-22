package decorator.drinks;

public abstract class Drink {

    private String description = "Unknown drink";

    private int size;

    public String getDescription(){
     return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
