package decorator;

import decorator.addons.Chocolate;
import decorator.drinks.Espresso;
import decorator.addons.WhippedCream;
import decorator.drinks.DarkCaffe;
import decorator.drinks.Drink;

public class Application {


    public static void main(String[] args) {
        Drink drink1 = new Espresso();

        Drink drink2 = new DarkCaffe();
        drink2 = new Chocolate(drink2);
        drink2 = new Chocolate(drink2);
        drink2 = new WhippedCream(drink2);

        System.out.println(drink1.getDescription() + " " + drink1.cost());
        System.out.println(drink2.getDescription() + " " + drink2.cost());
    }
}
