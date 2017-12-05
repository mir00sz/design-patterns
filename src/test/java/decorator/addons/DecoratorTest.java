package decorator.addons;

import decorator.drinks.DarkCaffe;
import decorator.drinks.Drink;
import decorator.drinks.Espresso;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorTest {

    private Logger logger = LoggerFactory.getLogger(DecoratorTest.class);

    @Test
    public void createDrink() {
        Drink espresso = new Espresso();

        Drink darkCaffe = new DarkCaffe();
        darkCaffe = new Chocolate(darkCaffe);
        darkCaffe = new Chocolate(darkCaffe);
        darkCaffe = new WhippedCream(darkCaffe);

        logger.info(espresso.getDescription() + " " + espresso.cost());
        logger.info(darkCaffe.getDescription() + " " + darkCaffe.cost());

    }


}
