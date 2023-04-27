package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example17 {
    public static void main(String[] args) {
        try(
                ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\semicolonProject\\dog"))){
            var dog =(Dog) objectInputStream.readObject();
            System.out.println(dog);
        }catch (IOException | SecurityException| ClassNotFoundException exception){
            exception.printStackTrace();
        }

    }
}
