package Practice;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title ;
    private String body;
    private LocalDateTime date = LocalDateTime.now();
    private int id ;

    public Entry(String title,String body){
        this.title= title;
        this.body = body;

   }

    public void setTitle(String title){
        this.title =title;

    }

    public String getTitle() {
       System.out.println("Title is "+title);
        return title;
    }

    public void contentOfEntry(String body){
        this.body = body;
    }
public String getBody(){
    System.out.println(body);
        return body;
}

    public void id(int idNumber){
        if (idNumber!= this.id) throw new IllegalArgumentException("invalid id");
       else id = idNumber;
    }

    public int getId() {
        return id;
    }
@Override
    public String toString(){
        String time = DateTimeFormatter.ofPattern("EEE,dd/MM/yyyy,hh:mm:ss a").format(date);
return String.format("""
      Title = %s
      Your massage is %s
      """,title,body);
    }

}
