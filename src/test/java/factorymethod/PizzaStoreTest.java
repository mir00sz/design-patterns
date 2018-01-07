package factorymethod;

import org.junit.Test;

public class PizzaStoreTest {


    @Test
    public void shouldProperlyCallOrderPizzaFactoryMethod(){
        PizzaStore italianPizzaStore = new ItalianPizzaStore();

        PizzaStore americanPizzaStore = new AmericanPizzaStore();

        Pizza pizza = italianPizzaStore.orderPizza("olives");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza1 = italianPizzaStore.orderPizza("veggie");
        System.out.println("John ordered a " + pizza1.getName() + "\n");

        Pizza pizza2 = americanPizzaStore.orderPizza("bacon");
        Pizza pizza3 = americanPizzaStore.orderPizza("ham");

        System.out.println("Ethan ordered a " + pizza2.getName() + "\n");
        System.out.println("John ordered a " + pizza3.getName() + "\n");


    }


}