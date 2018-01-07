package factorymethod;

/**
 * This class represents CocreteProduct on the diagram:
 * https://docs.google.com/document/d/1WAiGiMSUHEnthggRbR9ziW2BcrK8iOztSbogEbzZHqs
 */
public class AmericanHamPizza extends Pizza {

    public AmericanHamPizza() {
        name = "American Ham Pizza";
        dough = "Extra Thik Dough";
        sauce = "Tomato Souce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
