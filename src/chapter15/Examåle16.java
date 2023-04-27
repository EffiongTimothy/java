package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Examåle16 {
    public static void main(String[] args) {
        try {
           FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\semicolonProject\\src\\chapter15\\seniorman2.txt");
            byte[] bytes = {116, 104, 105, 115, 32, 109, 101, 116, 104, 111, 100, 32, 105, 115, 32, 99, 97, 108, 108, 101, 100, 32, 119, 104, 101, 110, 32, 116, 104, 101, 32, 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 32, 114, 117, 110, 115};
                fileOutputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



}
}