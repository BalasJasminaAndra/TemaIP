import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        int num1 = scanner.nextInt();

        System.out.print("Introdu al doilea numar: ");
        int num2 = scanner.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) 
        { 
            double media = (num1 + num2) / 2.0;
            System.out.println("Media aritmetica este: " + media);
        } else if (num1 % 2 != 0 && num2 % 2 != 0) 
        {
            int produs = num1 * num2;
            System.out.println("Produsul numerelor este: " + produs);
        } 
        else 
        { 
            int suma = num1 + num2;
            System.out.println("Suma numerelor este: " + suma);
        }
    }
}
