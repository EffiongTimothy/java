package tdd;

import chapterThree.tdd.AirConditioner;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void airConditionerOnTest(){
        AirConditioner conditioner = new AirConditioner();
            conditioner.turnOn();
         assertTrue( conditioner.getState());

    }
    @Test
    public void airConditionerOffTest() {
       // given that I have an AC
        AirConditioner conditioner = new AirConditioner();
        // my AC is on
        conditioner.turnOn();
       // when I turn it off
        conditioner.turnOff();
        // check that it is off
        assertTrue(conditioner.getState());
    }

    @Test
    public void increaseAirConditionerTemperatureTest() {
        //Given that I have an AC
        AirConditioner conditioner = new AirConditioner();
        //My AC is ON
        conditioner.turnOn();
        //When I increase temperature beyond 30
        conditioner.increaseTemperature(44);
        int conditionerTemp = conditioner.getTemperature();
        //check that temperature is still 30
        assertEquals(30,conditionerTemp);
    }
    @Test
    public void DecreaseAirConditionerTemperatureTest() {
      // Given that I have an AC
        AirConditioner conditioner = new AirConditioner();
       // My AC is on
        conditioner.turnOn();
       // When I decrease temperature below 16
        conditioner.decreaseTemperature(7);
        int conditionerTemp = conditioner.getTemperature();
        // Check that temperature is still 16
        assertEquals(16,conditionerTemp);
    }



    }
