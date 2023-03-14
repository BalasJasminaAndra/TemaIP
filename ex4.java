import java.util.Scanner
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.print("Introdu primul numar:");
        int no1 = scanner.nextInt();

        System.out.print("Introdu al doilea numar:");
        int no2 = scanner.nextInt();

        System.out.print("Introdu al treilea numar:");
        int no3 = scanner.nextInt();
      int minim = no1;
if (no2 < minim); 
        {
            minim = no2;
        }

  if (no3 < minim) 
        {
            minim = no3;
        }

        System.out.println("Valoarea minima este:" + minim);
    }
    }
}

