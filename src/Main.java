import business.CardReader;
import business.FingerPrintReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        choose();
    }
    /** Kullanıcı bazen parmak izi okutmak ister bazen de kart okutmak isteyebilir
     * Örneğin elinde eldiven varsa kart okutmak isteyebilir veya titiz ise aynı şekilde kart okutmak isteyebilir.  */
    public static void choose() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 or 2 for choose your aim. ");
        number = scanner.nextInt();

        if (number == 1) {
            FingerPrintReader fingerPrintReader = new FingerPrintReader();
            fingerPrintReader.isMatches("ABC");
            choose();
        } else if (number == 2) {
            CardReader cardReader = new CardReader();
            cardReader.add();
            cardReader.isMatches(1, "01234567891");
            choose();
        }
    }
}
