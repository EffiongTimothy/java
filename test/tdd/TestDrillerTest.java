package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void firstUtmeTest () {
        TestDriller copies = new TestDriller();
        int copy = copies.numberOfcopies(4);
        assertEquals( 8000,copy);
    }
    @Test
    public void secondUtmeTest(){
    TestDriller copies = new TestDriller();
    int copy = copies.numberOfcopies(5);
    assertEquals(9000, copy);
        }
        @Test
        public void ThirdUtmeTest() {
            TestDriller copies = new TestDriller();
            int copy = copies.numberOfcopies(10);
            assertEquals(16000, copy);
        }
    @Test
    public void FourthUtmeTest() {
        TestDriller copies = new TestDriller();
        int copy = copies.numberOfcopies(49);
        assertEquals(73500, copy);
    }
    @Test
    public void FifthUtmeTest() {
        TestDriller copies = new TestDriller();
        int copy = copies.numberOfcopies(99);
        assertEquals(128700, copy);
    }
    @Test
    public void SixthUtmeTest() {
        TestDriller copies = new TestDriller();
        int copy = copies.numberOfcopies(100);
        assertEquals(120000, copy);
    }
    @Test
    public void SevenUtmeTest() {
        TestDriller copies = new TestDriller();
        int copy = copies.numberOfcopies(499);
        assertEquals(548900, copy);
    }
    @Test
    public void EightUtmeTest() {
        TestDriller copies = new TestDriller();
        int copy = copies.numberOfcopies(600);
        assertEquals(600000, copy);
      }
    }


