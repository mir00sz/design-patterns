package factorymethod;

/**
 * This class represents CocreteProduct on the diagram:
 * https://docs.google.com/document/d/1WAiGiMSUHEnthggRbR9ziW2BcrK8iOztSbogEbzZHqs
 */
public class AmericanBaconPizza extends Pizza {


    public AmericanBaconPizza() {
        name = "American Bacon Pizza";
        dough = "Extra Thik Dough";
        sauce = "American Tomato Souce";
        toppings.add("Shredded Mozzarella Cheese");

    }
}
