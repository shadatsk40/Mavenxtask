package hw.sweet;
import java.util.Scanner;
public class sweets {
	Scanner sc=new Scanner(System.in);
	public void laddoo() {
		System.out.println("Enter the amount of sweet in grams and cost per kg");
		int wt=sc.nextInt();
		int cost=sc.nextInt();
		int total=(wt/1000)*cost;
		System.out.println("Total cost of candies is:"+total);
	}
	public void gulabjaamun() {
		System.out.println("Enter the amount of sweet in grams and cost per kg");
		int wt=sc.nextInt();
		int cost=sc.nextInt();
		int total=(wt/1000)*cost;
		System.out.println("Total cost of candies is:"+total);
	}
}
