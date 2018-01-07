package factorymethod;


/**
 * This is concrete Factory from diagram
 * https://docs.google.com/document/d/1WAiGiMSUHEnthggRbR9ziW2BcrK8iOztSbogEbzZHqs/edit#
 */
public class ItalianPizzaStore extends PizzaStore {


    Pizza createPizza(String item) {
        if (item.equals("olives")) {
            return new ItalianOlivesPizza();
        } else if (item.equals("veggie")) {
            return new ItalianVeggiePizza();
        } else return null;
    }
}
