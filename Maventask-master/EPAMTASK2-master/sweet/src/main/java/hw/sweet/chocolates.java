package hw.sweet;
import java.util.Scanner;

public class chocolates {
	Scanner sc=new Scanner(System.in);
	public void candy() {
		System.out.println("Enter No. of Candies, weigth and price of each Candy");
		int quantity=sc.nextInt();
		int wt=sc.nextInt();
		int cost=sc.nextInt();
		System.out.println("Total weight of candies is:"+quantity*wt+"gms");
		System.out.println("Total cost of candies is:"+quantity*cost);
	}
	public void lollipop() {
		System.out.println("Enter No. of Lollipops, weigth and price of each lollipop");
		int quantity=sc.nextInt();
		int wt=sc.nextInt();
		int cost=sc.nextInt();
		System.out.println("Total weight of lollipop is:"+quantity*wt+"gms");
		System.out.println("Total cost of lollipop is:"+quantity*cost);
	}
	

}
