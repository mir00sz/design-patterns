package decorator.addons;

import decorator.drinks.Drink;

public class WhippedCream extends AddonDecorator {


    public WhippedCream(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + " + Whipped cream";
    }

    public double cost() {
        return drink.cost() + 0.1;
    }
}
