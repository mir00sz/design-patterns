package factorymethod;

/**
 * This class represents CocreteProduct on the diagram:
 * https://docs.google.com/document/d/1WAiGiMSUHEnthggRbR9ziW2BcrK8iOztSbogEbzZHqs
 */
public class ItalianOlivesPizza extends Pizza{


    public ItalianOlivesPizza() {
        name = "Italian Olives Pizza";
        dough = "Extra Thin Dough";
        sauce = "Italian Tomato Souce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
