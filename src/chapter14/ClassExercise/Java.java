package chapter14.ClassExercise;

import javax.swing.*;

public class Java {
    public static void main(String[] args) {
      String dates ="01/76/1970";
      String word = JOptionPane.showInputDialog("enter anything even swear words");
        System.out.println(convert(dates));
        JOptionPane.showMessageDialog(null,hash(word));
    }
private static String convert(String date) {
    if(date.startsWith("01/01/1970")){
        return "01 January 1970";}
        if(date.startsWith("01/02/1970")){
        return "01 Febuary 1970";}
        if(date.startsWith("01/03/1970")){
        return "01 March 1970";}
        if(date.startsWith("01/04/1970")){
        return "01 April 1970";}
        if (date.startsWith("01/05/1970")) {
        return "01 may 1970";
    }
    if (date.startsWith("01/06/1970")) {
        return "01 june 1970";
    }
    if (date.startsWith("01/07/1970")) {
        return "01 July 1970";
    }
    if (date.startsWith("01/08/1970")) {
        return "01 august 1970";
    }
    if(date.startsWith("01/09/1970")){
        return "01 September 1970";}
    if(date.startsWith("01/10/1970")){
        return "01 October 1970";}
    if(date.startsWith("01/11/1970")){
        return "01 November 1970";}
    if(date.startsWith("01/12/1970")){
        return "01 December 1970";}
return "Month Does not Exist";}
    private static String hash(String word) {
        if (word.contains("fuck")) {
            word = word.replace("uc", "##");
        }
        if (word.contains("ass")) {
            word = word.replace("ss", "##");
        }
        if (word.contains("bitch")){
            word = word.replace("itc","###");
        }
        return word;
    }
}

