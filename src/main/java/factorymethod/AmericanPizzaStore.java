package factorymethod;

/**
 * This is concrete Factory from diagram
 * https://docs.google.com/document/d/1WAiGiMSUHEnthggRbR9ziW2BcrK8iOztSbogEbzZHqs
 */
public class AmericanPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("bacon")) {
            return new AmericanBaconPizza();
        } else if (item.equals("ham")) {
            return new AmericanHamPizza();
        } else return null;
    }
}
