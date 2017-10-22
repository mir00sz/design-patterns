package decorator.drinks;

public class DarkCaffe extends Drink{
    public double cost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return "Dark Caffe";
    }
}
