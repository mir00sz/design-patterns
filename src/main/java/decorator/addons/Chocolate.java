package decorator.addons;

import decorator.drinks.Drink;

public class Chocolate extends AddonDecorator {


    public Chocolate(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + " + chocolate";
    }

    public double cost() {
        return drink.cost()+0.2;
    }
}
