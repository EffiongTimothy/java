package chapter14.ClassExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    public static void main(String[] args) {
        String userInput = "email@gmail.com";
        String regex = "[a-z]+@[a-z]+\\.[a-z]{2,}";
        System.out.println(userInput.matches(regex));
        System.out.println(Pattern.matches(regex,userInput));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher);
    }
}
