package chapterFour;

import java.util.Scanner;

import static chapterFour.NokiaFunctions.*;


@SuppressWarnings("ALL")
public class Nokia3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome\n");
        System.out.println(" Nokia \n \n press '1' to go to main menu");
        int userInput = scanner.nextInt();
        int input;

        for (int counter = userInput; counter > 0; counter++) {
            while (userInput != 1) {
                System.out.println("press '1' to go to Main menu");
                userInput = scanner.nextInt();}
            switch (userInput) {
                case 1 -> mainMenu(userInput);}
            input = scanner.nextInt();


            switch (input) {
                case 1 ->{ menu1(input);
                input = scanner.nextInt();
                switch (input) {
                    case 8 -> {innerMenu1(input);
                        input = scanner.nextInt();
                        switch (input) {
                            case 3 -> {
                                menu1(input);
                                input = scanner.nextInt();}}}
                    case 11 -> mainMenu(input);}}


                case 2 -> {
                    menu2(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 7 -> {
                            innerMenu(input);
                            input = scanner.nextInt();

                            switch (input) {
                                case 1 -> {innerMenu2(input);
                                input = scanner.nextInt();
                                switch (input){case 4 ->{innerMenu(input);
                                input = scanner.nextInt();}}}

                                case 2 -> {innerMenu2(input);
                                input = scanner.nextInt();
                                switch (input){case 4 ->{innerMenu(input);
                                input = scanner.nextInt();}}}

                                case 3 ->{ menu2(input);
                            input = scanner.nextInt();}}}
                        case 11 -> mainMenu(input);}}


                case 3 -> {
                    menu3(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 4 -> mainMenu(input);}}


                case 4 -> {menu4(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 5 ->{ innerMenu3(input);
                            input = scanner.nextInt();
                        switch (input){
                            case 6 -> {menu4(input);
                                input = scanner.nextInt();}}}

                         case 6 ->{innerMenu3(input);
                             input = scanner.nextInt();
                        switch (input){
                            case 4 ->{menu4(input);
                                input = scanner.nextInt();}}}

                         case 7 -> {innerMenu3(input);
                             input = scanner.nextInt();
                        switch (input){
                            case 3 ->{menu4(input);
                            input = scanner.nextInt();}}}

                        case 9 -> mainMenu(input);}}


                case 5 -> {
                    menu5(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 10 -> mainMenu(input);}}


                case 6 -> {
                    menu6(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 1, 2, 3 -> {innerMenu4(input);
                            input = scanner.nextInt();
                            switch (input){
                                case 7 ->{menu6(input);
                                    input = scanner.nextInt();
                                }}}
                        case 5 -> mainMenu(input);}}

                case 7 -> {
                    menu7(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 2 -> mainMenu(input);
                    }
                }

                case 8 -> {
                    menu8(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 3 -> mainMenu(input);
                    }
                }

                case 9 -> {
                    menu9(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 2 -> mainMenu(input);
                    }
                }

                case 10 -> {
                    menu10(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 2 -> mainMenu(input);
                    }
                }

                case 11 -> {
                    menu11(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 7 -> mainMenu(input);
                    }
                }


                case 12 -> {
                    menu12(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 5 -> mainMenu(input);
                    }
                }

                case 13 -> {
                    menu13(input);
                    input = scanner.nextInt();
                    switch (input) {
                        case 3 -> mainMenu(input);
                    }
                }

                case 14 -> {System.out.println("GoodBye");
                System.exit(1);
                }
                default -> {
                    while (input > 14){System.out.println("input a correct value");
                input = scanner.nextInt();}}
            }
        }
    }
}






