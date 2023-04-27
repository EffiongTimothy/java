//package tdd.ChapterSix;
//
//import ChapterSix.Coin;
//
//import java.security.SecureRandom;
//
//public class CoinTossGame {
//   public static final int HEADS_COUNT =0;
//   public static final int TAILS_COUNT;
//    private Coin coin;
//
//    public CoinTossGame(int headCount,int tailsCount){
//        HEADS_COUNT = headCount;
//        TAILS_COUNT=tailsCount;
//    }
//    public static String getMenu() {
//        return """
//                1.Toss coin
//                2.menu2
//                3.menu3
//                """;
//    }
//public String flip(){
//    SecureRandom secureRandom = new SecureRandom();
//    int randomnumber=secureRandom.nextInt(2);
//     if (randomnumber == 0) return coin.HEADS.name();
//     return coin.TAILS.name();
//}
//}
