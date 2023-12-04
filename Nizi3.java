package nizasoo3;
import java.util.Scanner;
public class Nizi3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, n;
		System.out.println("Do brojot: ");
		n=input.nextInt();
		i=1;
		while(i <=n)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			i=i+1;
		}
			}
		}