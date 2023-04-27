package Practice;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DairyMain {
    private static final Scanner keyboardInputCollector = new Scanner(System.in);
private static Random rand = new Random();
private static int randomInts;
 private static final Dairy lifeStory =new Dairy();

    public static void main(String[] args) {
     mainMenu();
    }

    private static void mainMenu() {
        String menuList = """
                ==========================
                welcome to Dairy
                1 -> create New Entry
                2 -> view existing Entry
                3 -> Delete Entry
                4 -> view number of Entry
                5 -> Exist
                """;
        var userInput = input(menuList);
        switch (userInput.charAt(0)){
        case '1' -> newEntry();
        case '2' -> viewExistingEntry();
        case '3' -> deleteEntry();
        case '4' -> viewNumberOfEntries();
        case '5' -> Exit();
        default -> mainMenu();
    }

    }

    private static void viewNumberOfEntries() {
       int result = lifeStory.NumbersOfEntry();
    display(String.valueOf(result));
    mainMenu();
    }

    private static void Exit() {
        display("exiting Application");
        System.exit(1);
    }
    private static void deleteEntry() {
        try {
        int id = Integer.parseInt(input("enter id number "));
        if (id == randomInts){
            boolean isDeleted = lifeStory.deleteEntry(id);
            display(String.valueOf(isDeleted));}
        else display("invalid id");
    } catch (NumberFormatException e) {
        display(e.getMessage());
    }
    mainMenu();
    }



    private static void newEntry() {
        String title = input("Enter title");
        String body = input("what happen today?");
         randomInts = rand.ints(2,0,10).sum();
        display("your id number is "+randomInts);
        display( lifeStory.newEntry(body,title));
        mainMenu();
    }

    private static void viewExistingEntry() {
        int id = Integer.parseInt(input("enter id number"));
        if (id == randomInts){
            Entry entry = lifeStory.ViewEntry(id);
            display(entry.toString());}
        else display("invalid id");
        mainMenu();
    }

    private static void display(String Prompt) {
        JOptionPane.showMessageDialog(null,Prompt);
    }

    private static String input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);
    }

}
