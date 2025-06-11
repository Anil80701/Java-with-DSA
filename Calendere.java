package java_with_dsa;
import java.util.Scanner;

public class Calendere {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your day");
		String day=sc.nextLine().toLowerCase();
		switch(day) {
		case "Monday":
			System.out.println("lets learn java");
			break;
		case "tuesday":
			System.out.println("lets learn java");
			break;
		case "wednesday":
			System.out.println("lets learn python");
			break;
		case "thursday":
			System.out.println("lets learn c++");
			break;
		case "friday":
			System.out.println("lets learn Scala");
			break;
		case "saturday":
			System.out.println("lets learn rubby");
			break;
		case "sunday":
			System.out.println("lets learn Anguler JS");
			break;
			default:
				System.out.println("");
			
		}
				
	}

}
