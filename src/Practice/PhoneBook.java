package Practice;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private  String phoneNumber;
    private  String name;
    private int count = 0;
    private boolean isBlocked = true;
private  Contact newContact1;
    private List<Contact> contacts = new ArrayList<>();


    public PhoneBook(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
public String createNewContact(String name, String phoneNumber,String emailAddress){
     newContact1 = new Contact(name,phoneNumber,emailAddress);
    contacts.add(newContact1);
    count++;
    return "saved "+ name;
}
public void deleteContact(String phoneNumber){
        try {
        if (count >1){
        for (Contact i: contacts) {
        if (i.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
            contacts.remove(i);}
        break;}
        count--;}
        else {}}
        catch (RuntimeException e){
            
        }
}
public Contact viewContactByNameAndPhoneNumber(String name,String phoneNumber){
    for (Contact contact:contacts) {
        if (contact.getName().equals(name) && contact.getPhoneNumber().equals(phoneNumber))
        return contact;
    }
return null;}

    public boolean isBlocked() {
        return isBlocked;
    }
public void unblocked(String name, String phoneNumber){
        if (name.equalsIgnoreCase(this.name)&& phoneNumber.equalsIgnoreCase(this.phoneNumber)){
    isBlocked = false;}
}
    public Object block(String name, String phoneNumber){
            if (name.equalsIgnoreCase(this.name)&& phoneNumber.equalsIgnoreCase(this.phoneNumber)){
            isBlocked = true;
            }

        return null;
    }
}
