package chatGBTCodes;
import java.util.Scanner;

public class CardChecker {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Collect credit card number from the user
            System.out.print("Enter your credit card number: ");
            long cardNumber = input.nextLong();

            // Determine the type of credit card based on the first digit
            String cardType = switch ((int) (cardNumber / 1000000000000L)) {
                case 4 -> "Visa";
                case 5 -> "Mastercard";
                case 6 -> "Discover";
                case 37 -> "American Express";
                default -> "Unknown";
            };

            // Check the length of the credit card number
            int length = (int)(Math.log10(cardNumber) + 1);
            if (length < 13 || length > 16) {
                System.out.println("Invalid card length: " + length);
                return;
            }

            // Check the validity of the credit card number using the  Luhn algorithm
            int sum = 0;
            boolean Even = length % 2 == 0;
            for (int i = 0; i < length; i++) {
                int digit = (int)(cardNumber % 10);
                if (Even) {
                    digit *= 2;
                    if (digit > 9) {
                        digit -= 9;
                    }
                }
                sum += digit;
                cardNumber /= 10;
                Even = !Even;
            }
            boolean isValid = sum % 10 == 0;

            // Display the results
            System.out.println("Card type: " + cardType);
            System.out.println("Card length: " + length);
            System.out.println("Card validity: " + (isValid ? "Valid" : "Invalid"));
        }
    }


