import java.util.Scanner;
public class fibo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("\n\n\nPress that How many numbers do you want : ");
		n = input.nextInt();

		int first = 0, second = 1, fibo;

		System.out.print(first + " " + second);
		for(int i = 3; i <= n; i++)
		{
			fibo = first + second;
			System.out.print(" "+fibo);
			first = second;
			second = fibo;
		}
		System.out.println();
	}

}