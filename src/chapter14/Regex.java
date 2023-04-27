package chapter14;
    import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
        public static void main(String[] args) {
            String regex = "[a?b]\\.[a-z]{3}.";
            String text = "a.rtrt";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.matches()) {
                System.out.println("Match found!");
            } else {
                System.out.println("No match found!");
            }
        }
    }


