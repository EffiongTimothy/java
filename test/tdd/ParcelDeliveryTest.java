package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelDeliveryTest {
    @Test
    public void whenRiderDeliveredFiftyToFiftyNineParcelTest(){
        ParcelDelivery parcelDelivery = new ParcelDelivery();
      int delivery = parcelDelivery.parcelDelivered(50);
        assertEquals(10000,delivery);
    }
@Test
public void whenRiderDeliveredsixtyToSixtyNineParcelTest(){
        ParcelDelivery parcelDelivery = new ParcelDelivery();
        int delivery = parcelDelivery.parcelDelivered(60);
        assertEquals(15000,delivery);
}
@Test
    public void whenRiderDeliveredseventyParcelAndAboveTest(){
    ParcelDelivery parcelDelivery = new ParcelDelivery();
    int delivery = parcelDelivery.parcelDelivered(70);
    assertEquals(35000,delivery);


}

}
