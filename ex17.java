import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int cifraMaxima = numar % 10;
        numar = numar / 10;

        while (numar > 0) {
            int cifraCurenta = numar % 10;
            if (cifraCurenta > cifraMaxima) {
                cifraMaxima = cifraCurenta;
            }
            numar = numar / 10;
        }

        System.out.println("Cifra maxima este: " + cifraMaxima);
    }
}
