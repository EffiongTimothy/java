//package tdd.ChapterSix;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class CoinTestingGameTest {
//    private CoinTossGame coinTossGame;
//    @BeforeEach
//    public void  setUp(){
//        coinTossGame = new CoinTossGame();
//    }
//    @Test
//public void testThatGameexists(){
//        assertNotNull(coinTossGame);
//        System.out.println("The game exists");
//    }
//@Test
//    public  void testMenuOption(){
//        String menu = CoinTossGame.getMenu();
//        assertTrue(menu.equals("""
//                1.Toss coin
//                2.menu2
//                3.menu3
//                """));
//    System.out.println(menu);
//}
//@Test
//    public void testCoinFlip(){
//        String outCome = coinTossGame.flip();
//        assertNotNull(outCome);
//    assertTrue(outCome.equals("HEAD") || outCome.equals("TAILS"));
//
//}
//@Test
//    public  void testCountOutCome(){
//        coinTossGame.flip();
//}
//}
