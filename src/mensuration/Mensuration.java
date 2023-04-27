package mensuration;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mensuration {
    public static void main(String[] args) {
        String lastDate = input("When was the last time you saw your period enter date eg: dd-MMMM-yyyy ");
        int daysBetweenPeriods = Integer.parseInt(input("Enter the number of days between each period you experience every month: "));
        int numberOfDaysPeriodLast = Integer.parseInt(input("Enter the number of days your period last"));
        int month = Integer.parseInt(input("Enter the number of month you would like to know when your next period will come: "));

        calculateNextPeriodDate(lastDate,month,daysBetweenPeriods,numberOfDaysPeriodLast);
    }
    public static void calculateNextPeriodDate(String date,int month,int daysBetweenCircles,int numberOfDaysPeriodLast) {
        String[] splitDate = date.split("-");
        LocalDate lastDate = LocalDate.of(Integer.parseInt(splitDate[2]),Integer.parseInt( splitDate[1]),Integer.parseInt( splitDate[0]));
       String lastPeriod = String.format("""
               Your last period Date starts from:= %s \nto %s
               Your safe period Date from the last period is from %s \nto %s
               
               your Next period Dates for the Next %s Month
               """,dateformat(lastDate),dateformat(lastDate.plusDays(numberOfDaysPeriodLast)),
               dateformat(lastDate.minusDays(3)),dateformat(lastDate.plusDays(numberOfDaysPeriodLast+3)),
               month);
       display(lastPeriod);

        for (int i = 1; i <= month; i++) {
            LocalDate date1 = lastDate.plusDays(daysBetweenCircles);
            String nextPeriod = String.format("""
                    Your next period Date for month %d starts from %s \nto %s
                    Your next safe period Date for %s %s %s \nto %s
                    
                    """,i,dateformat(date1), dateformat(date1.plusDays(numberOfDaysPeriodLast)), date1.getMonth(),
                    date1.getYear(), dateformat(date1.minusDays(3)),
                    dateformat(date1.plusDays(numberOfDaysPeriodLast+3)));
                    display(nextPeriod);
            lastDate = date1;
        }
        display("GO GET SOME TAMPONS");

    }

    public static String dateformat(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\n EEEE d  MMMM  yyyy");
        return formatter.format(date);
    }
    public static String display(String massage){
        JOptionPane.showMessageDialog(null,massage);
        return massage;
    }
    public static String  input(String input){
       return JOptionPane.showInputDialog(input);
    }
}
