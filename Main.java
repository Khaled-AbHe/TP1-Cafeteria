import java.util.Scanner;
import java.lang.Object;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static String menu = String.format("\n%s\n%14s\n%s\n1. Prendre une commande\n2. Consulter les ventes\n3. Quitter\n\nEntrez votre choix au menu: ", lineBuilder('*', 25), "MENU", lineBuilder('*', 25));
    static String[][] prix = {
        {"2.50", "3.50", "4.00"},
        {"2.00", "3.00", "3.50"},
        {"2.75", "3.75", "4.25"},
    };
    static int[][] montant = new int[3][3];
    public static void main(String[] args) {
        menu();
        sc.close();
    }

    public static void menu() {
        byte choix;
        while(true) {
            System.out.print(menu);
            choix = Byte.parseByte(sc.nextLine().trim());
            switch (choix) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choix invalide!");
                    break;
            }
        }
    }

    public static String lineBuilder(char x, int length){
        String line = "";
        for (int i = 0; i < length; i++) {
            line += x;
        }
        return line;
    }

    public static String selectLetter() {
        String choix = sc.nextLine().toLowerCase().trim();
        if (choix.length() != 1) {
            throw new InputMismatchException();
        }
        return choix;
    }
}
