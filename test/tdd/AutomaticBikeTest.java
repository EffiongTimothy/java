package tdd;

import chapterThree.tdd.AutomaticBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticBikeTest {

    @Test
        public void automaticBikeOnTest(){
        //given that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
        // i turn it on
        bajaj.turnOn();
        //check that it is on
        assertTrue(bajaj.getState());
    }

@Test
    public void automaticBikeOffTest(){
        //given that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
        //my bike is on
        bajaj.turnOn();
        // when i turn it off
        bajaj.turnOff();
        // check that it is off
        assertTrue(bajaj.getState());
}

    @Test
    public void automaticBikeAccelerationGearOneTest() {
        //given that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
        //my bike is on
        bajaj.turnOn();
        // when i accelerate to gear 1
        bajaj.accelerate(1);
        //when current speed is 15
        bajaj.accelerateSpeedGuage(15);
        //check that the total speed is 16
        int bajajBike = bajaj.getGuage();
        assertEquals(16, bajajBike);
    }

    @Test
    public void automaticBikeAccelerationGearTwoTest() {
        //given that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
        //my bike is on
        bajaj.turnOn();
        //the initial speed is 24
        bajaj.accelerate(2);
        // when i accelarate to gear 2
        bajaj.accelerateSpeedGuage(24);
        // check that my total speed 26
        int bajajBike = bajaj.getGuage();
        assertEquals(26, bajajBike);
    }

    @Test
    public void automaticBikeAccelerationGearThreeTest() {
        // gven that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
       // my bike is on
        bajaj.turnOn();
        // when i accelerate to gear 3
        bajaj.accelerate(3);
        // when current speed is 35mph
        bajaj.accelerateSpeedGuage(35);
        int bajajBike = bajaj.getGuage();
        //check that speed accelerate to 38mph
        assertEquals(38, bajajBike);
    }

        @Test
public void automaticBikeAccelerationGearFourTest() {
    // Given that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
 // My bike is  on
    bajaj.turnOn();
    // when i accelerate to gear 4
    bajaj.accelerate(4);
    // when speed is 44mph
    bajaj.accelerateSpeedGuage(44);
    int bajajBike = bajaj.getGuage();
    //check that speed increase to
    assertEquals(48, bajajBike);

}
    @Test
    public void automaticBikeDecelerationGearOneTest() {
        //given that i have an automatic bike
        AutomaticBike bajaj = new AutomaticBike();
     // my bike is on
        bajaj.turnOn();
        //when i decelerate to gear one
        bajaj.decelerate(1);
        //when speed is 15mph
        bajaj.decelerateSpeedGuage(15);
        int bajajBike = bajaj.getGuage();
        // check that speed decelerate to 14mph

        assertEquals(14, bajajBike);
    }
    @Test
    public void automaticBikeDecelerationGearTwoTest() {
        AutomaticBike bajaj = new AutomaticBike();
        bajaj.turnOn();
        bajaj.decelerate(2);
        bajaj.decelerateSpeedGuage(24);
        int bajajBike = bajaj.getGuage();
        assertEquals(22, bajajBike);
    }
    @Test
    public void automaticBikeDecelerationGearThreeTest() {
        AutomaticBike bajaj = new AutomaticBike();
        bajaj.turnOn();
        bajaj.decelerate(3);
        bajaj.decelerateSpeedGuage(35);
        int bajajBike = bajaj.getGuage();
        assertEquals(32, bajajBike);
    }
    @Test
    public void automaticBikeDecelerationGearFourTest() {
        AutomaticBike bajaj = new AutomaticBike();
        bajaj.turnOn();
        bajaj.decelerate(4);
        bajaj.decelerateSpeedGuage(44);
        int bajajBike = bajaj.getGuage();
        assertEquals(40, bajajBike);
    }


}
