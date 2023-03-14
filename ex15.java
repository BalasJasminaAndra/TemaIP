public class Main {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                int numar = 3 * a + 2 * b;
                if (numar % 9 == 0) {
                    System.out.println("Numarul " + (1000 + numar) + " se divide cu 9.");
                }
            }
        }
    }
}
