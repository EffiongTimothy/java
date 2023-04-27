package Practice;

public class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name, String phoneNumber,String emailAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;

    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    @Override
    public String toString(){
        return String.format("""
                =================
                contact name %s
                contact phoneNumber %s
                 contact emailAddress %s
                 """, name,phoneNumber,emailAddress);
    }


    //public void setName(String firstName,String lastName){
//        this.name = firstName +" "+ lastName;
// }

//public void addPhoneNumber(String phoneNumber){
//        this.phoneNumber = phoneNumber;
//}

//public void addEmailAddress(String emailAddress){
//        this.emailAddress = emailAddress;
//}
//public String getEmailAddress(){
//        return emailAddress;
//}

}
