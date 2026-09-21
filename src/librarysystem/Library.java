package librarysystem;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String book1 ="Things fall apart";
		String book2 ="Introduction to Python";
		String book3 ="Web development principles";
		String book4="Computerised financial modelling";
		
		//for loop-Helps to know number of times to execute something stops running if condition is no longer true
		System.out.println("======LIBRARY SYSTEM======");
		System.out.println("Books available");
		
		for(int i1 = 1; i1<=4;i1++) {
			System.out.println(i1 + ".Book");
		}
		System.out.println("1." + book1);
		System.out.println("2." + book2);
		System.out.println("3." + book3);
		System.out.println("4." + book4);
		//This lists the books from 1-4
		
		//while loop
		//helps choose a book
		int selectedBook1=0;
		while(selectedBook1 <1 || selectedBook1 >4) {
			System.out.println("Choose a book (1-4): ");
			selectedBook1 = scanner.nextInt();
			
		}
		System.out.println("You selected book number: " + selectedBook1);

		//do while loop
		char answer = 'Y';
		do {
		System.out.println("Do you want to borrow another book? (Y/N): ");
		answer = scanner.next().charAt(0);
		}while(answer =='Y' || answer == 'y');
		
		//Tenary statement
		System.out.println("How many days will you borrow the book? ");
		int days = scanner.nextInt();
		
		String status = days <=7? "Within borrowing limit" :"Borrowing period exceeded";
		System.out.println("Status: " + status);
		
		
		

	}

}
