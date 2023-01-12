package chapterFour;

import java.util.Scanner;

public class Nokiaafunctions {
    static void mainMenu(int menu) {

        if (menu == 1 )
            System.out.println("""
                        Menu List
                    1.Phone book
                    2.Message
                    3.chat
                    4.Call register
                    5.Tones
                    6.Settings
                    7.Call divert
                    8.Games
                    9.Calculator
                    10.Reminders
                    11.Clock
                    12.Profile
                    13.Sim services
                    14.Exit""");

    }
public static void menu1(int back) {
    System.out.println("""
                Phone book) 
            1.Search
            2.Services Nos.
            3.Add name
            4.Erase
            5.Edit
            6.Assign tone
            7.Send b'card
            8.Options
            9.Speed details
            10.voice tags
            11.Back to main menu""");
}
    public static void innerMenu1(int back){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                                Options
                            1.Type of view
                            2.Memory status
                            3.back""");
    //int input = scanner.nextInt();
    }

    public static void menu2(int back){
        System.out.println("""
                            Messages
                        1.Write a message
                        2.Inbox
                        3.Outbox
                        4.Picture message
                        5.Templates
                        6.Simileys
                        7.Message settings
                        8.Info service
                        9.Voice mailbox number
                        10.Service command editor
                        11.Back""");
    }
public static void innerMenu(int back){
    System.out.println("""
                                Message settings
                            1.Set 1
                            2.Common
                            3.Back""");
}
    public static void innerMenu2(int back){
if(back == 1) {
    System.out.println("""
                Set 1
            1.Message center number
            2.Message sent as
            3.Message validity
            4.Back
            """);
}
 else {
    System.out.println("""
              Common
         1.Delivery reports
         2.Reply via same center
         3.Characters support
         4.Back""");}
    }
    public static void menu3(int back){
    System.out.println("""
                                Chat
                            1.Facebook
                            2.Twitter
                            3.Palmplay
                            4.Back""");
}
public static void menu4(int back){
    System.out.println("""
                                Call register
                            1.Missed calls
                            2.Received calls
                            3.Dailed numbers
                            4.Erase recent call lists
                            5.Show call duration
                            6.Show call costs
                            7.Call cost settings
                            8.Prepaid credit
                            9.Back""");
}
public static void innerMenu3(int back){
    if (back == 5){
        System.out.println("""
                                    Show call duration
                                1.Last call duration
                                2.All calls'duration
                                3.Recieved calls'duration
                                4.Dailed calls'duration
                                5.Clear timers
                                6.Back""");}
if (back == 6){
    System.out.println("""
                                    Show call costs
                                1.Last call cost
                                2.All calls'cost
                                3.Clear counters
                                4.Back""");}
    if (back == 7){
        System.out.println("""
                                    Call cost settings
                                1.Call cost limit
                                2.Show costs in
                                3.Back""");}

    }
public static void menu5(int back){
    System.out.println("""
                                Tones
                            1.Ringing tone
                            2.Ringing volume
                            3.Incoming call alert
                            4.Composer
                            5.Message alert tone
                            6.Keypad tones
                            7.Warning and game tones
                            8.Vibrating alert
                            9.Screen saver
                            10.Back""");
}
public static void menu6(int back){
    System.out.println("""
                                Settings
                            1.Call setting
                            2.Phone settings
                            3.Security setting
                            4.Restore factory settings
                            5.Back""");
}
public static void innerMenu4(int back){
    if (back == 1){System.out.println("""
                                    Call settings
                                1.Automatic redial
                                2.Speed dailing
                                3.Call waiting option
                                4.Own number sending
                                5.Phone line in use
                                6.Automatic answer
                                7.Back""");}

    if (back == 2){System.out.println("""
                                    Phone settings
                                1.Language
                                2.Cell info display
                                3.Welcome note
                                4.Network Selection
                                5.Lights
                                6.Confirm SIM service actions
                                7.Back""");}
if (back==3){ System.out.println("""
                                    Security settings
                                1.Pin code request
                                2.Call barring service
                                3.Fixed dailing
                                4.Closed user group
                                5.Phone security
                                6.Change access codes
                                7.Back""");}
    }

public static void menu7(int back){
    System.out.println("""
                             Call divert
                            1.call
                            2.Back""");
}
public static void menu8(int back){
    System.out.println("""
                                Games
                            1.Sudoku
                            2.Mine craft
                            3.Back""");
}
public static void menu9(int back){
    System.out.println("""
                                Calculator
                            1.Calculator
                            2.Back""");
}
public static void menu10(int back){
    System.out.println("""
                            Reminders
                            1.Auto reminder
                            2.Back""");
}
public static void menu11(int back){
    System.out.println("""
                            1.Alarm clock
                            2.Clock settings
                            3.Date setting
                            4.Stopwatch
                            5.Countdown timer
                            6.Ato update of date and time
                            7.Back""");
}
public static void menu12(int back){
    System.out.println("""
                                Profile
                            1.General
                            2.Silent
                            3.Meeting
                            4.vibrate
                            5.Back""");
}
public static void menu13(int back){
    System.out.println("""
                                 SIM services
                            1.Support
                            2.SIM tool KIT
                            3.Back""");
}
}
