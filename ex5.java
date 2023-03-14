import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n:");
        int n = scanner.nextInt();

        int suma = 0;

        for (int i = 2; i <= n * 2; i += 2) {
            suma += i;
        }

        System.out.println("Suma primelor " + n + " numere pare este:" + suma);
    }
}
