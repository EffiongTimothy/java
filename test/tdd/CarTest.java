package tdd;

import chapterThree.tdd.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class  CarTest {
    @Test
    public void testThatCarCanBeCreated(){
        Car benz = new Car("G-390", "2022", 50.00);
        assertNotNull(benz);
    }
     @Test
    public void testThatCarsAttributesAreProperlyinitialised() {
         Car benz = new Car("G-390", "2022", 50.00);
  assertEquals("G-390", benz.getModel());
 assertEquals("2022", benz.getYear());
assertEquals(50.00, benz.getPrice());
    }
@Test
public void testThatOnlyPositiveAmountAreAllowedASCarPrice(){
    Car benz = new Car("G-390", "2022", 50.00);
      benz.setPrice(-200000);
      assertEquals(50.00, benz.getPrice());

}
@Test
public void testDiscount(){
    Car benz = new Car("G-390", "2022", 50.00);
    benz.applyDiscount(10);
    }
}
