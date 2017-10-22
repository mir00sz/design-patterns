package decorator.addons;

import decorator.drinks.Drink;

public abstract class AddonDecorator extends Drink {

    Drink drink;


    public AddonDecorator(Drink drink) {
        this.drink = drink;
    }

    public abstract String getDescription();



}
