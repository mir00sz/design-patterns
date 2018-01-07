package factorymethod;


/**
 * This is the Factory object from diagram
 *
 */
public abstract class PizzaStore {


    /**
     * This is factory method. It is supposed to be overrided by subclasses.
     * @param item
     * @return
     */
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
