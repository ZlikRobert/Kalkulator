// Import the Scanner object for user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display a welcome message and menu options
        System.out.println("Witaj w kalkulatorze!");
        System.out.println("Wybierz rodzaj operacji:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.print("Twój wybór: ");

        // Read the user's choice from input
        int wybor = input.nextInt();

        // Prompt the user to enter the two numbers
        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = input.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = input.nextDouble();

        double wynik;

        // Use a switch statement to perform the selected operation
        switch (wybor) {
            case 1:
                wynik = Kalkulator.dodaj(liczba1, liczba2);
                System.out.println("Wynik: " + wynik);
                break;
            case 2:
                wynik = Kalkulator.odejmij(liczba1, liczba2);
                System.out.println("Wynik: " + wynik);
                break;
            case 3:
                wynik = Kalkulator.pomnoz(liczba1, liczba2);
                System.out.println("Wynik: " + wynik);
                break;
            case 4:
                // Use try-catch to handle division by zero
                try {
                    wynik = Kalkulator.podziel(liczba1, liczba2);
                    System.out.println("Wynik: " + wynik);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Niepoprawny wybór!");
                break;
        }

        // Close the Scanner object
        input.close();
    }

}