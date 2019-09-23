import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indtsast et tegn: ");

            char a = scanner.next().charAt(0);

            if (a >= 'A' && a <= 'Z') {
                System.out.println("Tegnet er et stort bogstav");

            } else if (a >= 'a' && a <= 'z') {
                System.out.println("Tegnet er et lille bogstav");

            } else if (a >= '0' && a <= '9') {
                System.out.println("Tegnet er et tal");

            } else if (a == '#' || a == '!' || a == '+' || a == '\\') {
                System.out.println("Tegnet er et specialtegn");
            } else {

            }

        }
    }
}
