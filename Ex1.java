import java.util.Scanner;
//1. Sa se citeasca de la tastatura un numar. Daca este mai mare decat 5 sa se afiseze pe ecran
//cuvantul ADMIS iar daca e mai mic sa se afiseze RESPINS. Daca numarul este mai mic
//decat 1 si mai mare decat 10 sa se afiseze INVALID.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
	if(number<10) &&  (number>5)
		System.out.print("ADMIS");
	else	if (number>0 && number<5)
	System.out.print("RESPINS");
	else if(number<1 && number>10)
			System.out.println("INVALID");
	}
}


}
