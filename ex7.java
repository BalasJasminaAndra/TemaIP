public class ex7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		float Media=0;
		for(int i=1;i<=n;i++)
		{
			int numar = input.nextInt();
			Media=Media+numar;
		}
		System.out.print(Media/n);

	}

}
