package chapter14.ClassExercise;

public class ConvertDateFormat {
    public static void main(String[] args) {
        String date = "18/03/2020";
        String[] dates = date.split("/");
        String month = "";
        switch (dates[1]){
            case "01" -> month = "january";
            case "02" -> month = "february";
            case "03" -> month = "march";
            case "04" -> month = "april";
            case "05" -> month = "may";
            case "06" -> month = "june";
            case "07" -> month = "july";
            case "08" -> month = "august";
            case "09" -> month = "september";
            case "10" -> month = "october";
            case "11" -> month = "november";
            case "12" -> month = "december";
        }
        System.out.printf("%s %s %s",dates[0],month,dates[2]);
    }
}
