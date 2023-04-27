package chapter14.ClassExercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//import static sun.awt.shell.Win32ShellFolderManager2.recent;

public class GettingAge {
    public static void main(String[] args) {
    String dob = "22/05/2000";
    System.out.println(getAge(dob));
    }
    private static int getAge(String dob) {
        String[] split = dob.split("/");
        LocalDate date = LocalDate.of(Integer.parseInt(split[2]),Integer.parseInt(split[1]),Integer.parseInt(split[0]));
        LocalDate recentDate = LocalDate.now();
        if(recentDate.getMonth() == date.getMonth() && recentDate.getDayOfMonth() == date.getDayOfMonth()){
            return recentDate.getYear() - date.getYear();
        }
        else{
        return Period.between(date,recentDate).getYears();
        }
    }
}
