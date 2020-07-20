package hw.sweet;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class App {
	
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	int choice;
    	System.out.println("Enter your choice:");
    	System.out.println("1)Chocolates  2)Sweets");
    	choice=sc.nextInt();
    	switch(choice) {
    	case 1:System.out.println("Choose type of chocolate");
    			System.out.println("1)Candy    2)Lollipop");
    			int choice1=sc.nextInt();
    			switch(choice1) {
    			case 1:chocolates ch=new chocolates();
    					ch.candy();
    					break;
    			case 2:chocolates ch1=new chocolates();
						ch1.lollipop();
						break;
    			default:System.out.println("Wrong choice");		
    			}
    			break;
    	case 2:System.out.println("Choose type of sweet");
    			System.out.println("1)Laddoo   2)GulabJaamun");
    			int choice2=sc.nextInt();
    			switch(choice2) {
    			case 1:sweets sw=new sweets();
    					sw.laddoo();
    					break;
    			case 2:sweets sw1=new sweets();
						sw1.gulabjaamun();
						break;
    			default:System.out.println("Wrong choice");		
    			}
    			break;
	default:System.out.println("Wrong choice");
    			
    	}
    	
    	
    }
}
