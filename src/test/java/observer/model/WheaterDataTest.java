package observer.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class WheaterDataTest {


    @Test
    public void shouldNotifyObservers() {
        WheaterData wheaterData = new WheaterData();
        WheterObserver wheterObserver = new WheterObserver(wheaterData);

        wheaterData.setValues(20.0, 0.1, 1000.2);

        assertEquals(wheaterData.getHumidity(), wheterObserver.getHumidity(),0.001);

    }


}
