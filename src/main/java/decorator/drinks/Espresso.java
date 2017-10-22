package decorator.drinks;

import decorator.drinks.Drink;

public class Espresso extends Drink {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
