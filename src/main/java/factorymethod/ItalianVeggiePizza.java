package factorymethod;

/**
 * This class represents CocreteProduct on the diagram:
 * https://docs.google.com/document/d/1WAiGiMSUHEnthggRbR9ziW2BcrK8iOztSbogEbzZHqs
 */
public class ItalianVeggiePizza extends Pizza {


    public ItalianVeggiePizza() {

        name = "Italian Veggie Pizza";
        dough = "Extra Thin Dough";
        sauce = "Italian Tomato Souce";
        toppings.add("no cheese");

    }
}
