package javasahoo;
import java.util.Scanner;
public class C7 {
	public static int sNo;
	public static String bookName;
	public static String authorName;
	public static int bookQty;
	public static int bookQtyCopy;

	static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Enter Serial No of Book:");
	    C7.sNo = input.nextInt();
	    input.nextLine();
	    System.out.println("Enter Book Name:");
	    C7.bookName = input.nextLine();
	    System.out.println("Enter Author Name:");
	    C7.authorName = input.nextLine();
	    System.out.println("Enter Quantity of Books:");
	    C7.bookQty = input.nextInt();
	    bookQtyCopy = C7.bookQty;
	 
                                                                                                                                                                                                                                                                                                                                                                                                                               
	}

}
