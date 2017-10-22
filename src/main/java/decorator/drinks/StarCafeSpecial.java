package decorator.drinks;

public class StarCafeSpecial extends Drink {

    @Override
    public String getDescription() {
        return "StarCafeSpecial";
    }

    public double cost() {
        return 0.89;
    }
}
