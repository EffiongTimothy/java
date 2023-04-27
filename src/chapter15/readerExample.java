package chapter15;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class readerExample {
    public static void main(String[] args) {
        char[] chars = new char[1024];
        try(FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\semicolonProject\\src\\chapter15\\assets\\timo.txt")) {
            int numberOfCharactersRead = fileReader.read(chars);
            System.out.println(numberOfCharactersRead);
            System.out.println(Arrays.toString(chars));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
