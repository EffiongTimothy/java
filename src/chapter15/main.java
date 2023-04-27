package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example18 {
    public static void main(String[] args) {
        try (
            var fileOutputStream = new FileOutputStream("dog");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
                Dog aja = new Dog(8,"deal");
                objectOutputStream.writeObject(aja);
            }catch (IOException | SecurityException exception){
            exception.printStackTrace();
        }
        }
    }

