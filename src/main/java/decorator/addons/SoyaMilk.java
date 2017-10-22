package decorator.addons;

import decorator.drinks.Drink;

public class SoyaMilk extends AddonDecorator {


    public SoyaMilk(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + " + Soya Milk";
    }

    public double cost() {
        double cost=0.0;
        switch (drink.getSize()){
            case 0:
                cost+=10.0;
                break;
            case 1:
                cost+=0.15;
                break;
            case 2:
                cost+=0.2;
                break;
        }
        return drink.cost() + cost;
    }
}
