package chapter14.ClassExercise;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
       String date="21/04/2023";
        String[] dates = date.split("/");

//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
//        System.out.println(date1);
        System.out.println(format(dates));
    }
private static String format(String[] date){
        LocalDate localDateTime = LocalDate.of(Integer.parseInt(date[2]),Integer.parseInt(date[1]),Integer.parseInt(date[0]));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM M yyyy");
   return formatter.format((localDateTime));
}
}

