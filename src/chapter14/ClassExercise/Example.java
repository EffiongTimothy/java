package chapter14;
    import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Example {
        public static void main(String[] args) {
            String email = "johndoe@example.com";
            String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]{3}";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println("Valid email address!");
            } else {
                System.out.println("Invalid email address!");
            }
        }
    }

