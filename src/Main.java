import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(12+45);
        System.out.println();
        int a = 12;
        int b = 45;
        System.out.println(a + b + " wynik");
        System.out.println("wynik " + a + b);

        Scanner scanner = new Scanner(System.in);
        System.out.println( (int) b/a);
        System.out.println("Podaj pierwszą liczbę");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double number2 = scanner.nextDouble();

        double result = number1 * number2;
        System.out.println(result);

        double number3 = 2.124;
        result = number1 * number1;
        System.out.println("Wynik mnozenia to: " + result);
        System.out.printf("Wynik mnozenia to: %.2f i liczby %f to: %.2f/n",
                number1, number2, result);
        System.out.println("Wynik mnozenia to: " + number1 + "i liczby to: "
                + number2 + " to: " + result);

        String str =  "Ale ma kota";
        boolean isTrue = false;
        System.out.println(s:"Tekst to %S - to jest %B", str, IsTrue);
    }
}



