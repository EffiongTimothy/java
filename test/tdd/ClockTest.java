package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClockTest {
    @Test
    public void clockHourTest(){
        Clock clock = new Clock(23,59,60);
        assertTrue(true);}

    @Test
    public void clockSetAndGetMethod(){
        Clock clock =new Clock(3,3,3);
        assertEquals(3, clock.getHour());
        assertEquals(3,clock.getMinute());
        assertEquals(3,clock.getSeconds());

    }
    @Test
public void clockSetMethod(){
    Clock clock =new Clock(3,3,3);
clock.setHour(22);
clock.setMinute(24);
clock.setSeconds(24);
assertEquals(22,clock.getHour());
assertEquals(24,clock.getMinute());
assertEquals(24, clock.getSeconds());
    }
@Test
public void clockShow(){
    Clock clock =new Clock(3,3,3);
    clock.displayTime(1,30,56);

}
}
