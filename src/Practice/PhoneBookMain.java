package Practice;

import javax.swing.*;

public class PhoneBookMain {
    private static  PhoneBook phoneBook;
    public static void main(String[] args) {
mainMenu();
    }
private static  void mainMenu(){
        String mainMenuList = """
                       PHONEBOOK
                1 -> Create Contact
                2 -> delete Contact
                3 -> search Contact
                4 -> Block Contact
                5 -> Exit""";
        String userInput = input(mainMenuList);
        switch (userInput.charAt(0)){
            case '1'-> createContact();
            case '2'-> deleteContact();
            case '3'-> searchContact();
            case '4'-> displayBlockMenu();
            case '5'-> exit();
        }
    }

    private static void searchContact() {
        try {
            String phoneNumber =input("enter phoneNumber");
            String name = input("enter name");
            if (phoneNumber.equals(phoneBook.block(name,phoneNumber))){
                display("contact is blocked");
                String userInput = input("press 5 to unblock");
                if (userInput.equals("5")){
                    phoneBook.unblocked(name,phoneNumber);
                }
            }
            Contact contactFound = phoneBook.viewContactByNameAndPhoneNumber(name,phoneNumber);
            if (contactFound == null){display("unkown contact");
                mainMenu();}
            display(contactFound.toString());
        } catch (Exception e) {
            display(e.getMessage());
        }

        mainMenu();
    }

    private static void deleteContact() {
        try {
            String phoneNumber = input("enter phoneNumber");
            phoneBook.deleteContact(phoneNumber);
            display("contact deleted");
        } catch (RuntimeException e) {
            display("empty contact list "+e.getMessage());
        }
        mainMenu();

    }


    private static void createContact()
             {
        String name = input("enter name");
        String phoneNumber = input("enter phone number");
        String emailAddress = input("enter emailAddress");
        phoneBook = new PhoneBook(name,phoneNumber);
        phoneBook.createNewContact(name,phoneNumber,emailAddress);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        display("contact saved");
        mainMenu();

    }
public static void exit(){
  System.exit(1);
}
    
private static void displayBlockMenu(){
        String blockMenu = """
                1-> Block
                2-> Unblock
                3-> Back
                """;
            String userInput = input(blockMenu);
            switch (userInput.charAt(0)){
                case '1'-> block();
                case '2'-> unblock();
                case '3'-> mainMenu();
            }
}

    private static void unblock() {
        String name = input("enter name of contact. ");
        String phoneNumber = input("enter phoneNumber: ");
phoneBook.unblocked(name,phoneNumber);
if (phoneBook.isBlocked()){
    display("Contact is not blocked ");
mainMenu();}
display("contact is unblocked");
displayBlockMenu();
    }

    private static void block() {
       String name = input("enter name of contact. ");
       String phoneNumber = input("enter phoneNumber: ");
        String confirmationInput = input("would you like to Block this Contact?");
        if (confirmationInput.equalsIgnoreCase(  "yes")){
       phoneBook.block(name,phoneNumber);}
        else {display("invalid Input");}
        while (!confirmationInput.equalsIgnoreCase("yes")){
            confirmationInput = input("would you like to Block this Contact?");
        }
       display("Contact is blocked");
       displayBlockMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt) {
    JOptionPane.showMessageDialog(null,prompt);
    }
}
