//Kabrina Brady

import java.util.Scanner;

public class BookOrderBrady2 {
	public static void main (String[] args) {
		double subtotal;
		int numBooks;
		double tax;
		final double TAXRATE = 0.055;
		double priceOfOrder;
		double shipping;
		final double SHIPPINGPERBOOK = 1.5;
		
		//Gets number of books purchased
		System.out.println("Number of books purchased: ");
		Scanner input = new Scanner(System.in);
		numBooks = input.nextInt();
		
		//Gets book subtotal
		System.out.println("Book Subtotal: ");
		subtotal = input.nextDouble();

		//Computes the tax
		tax = subtotal * TAXRATE;

		//Computes the shipping
		shipping = SHIPPINGPERBOOK * numBooks;

		//Computes the final price
		priceOfOrder = subtotal + tax + shipping;
		
		//Prints the receipt
		System.out.println("Number of books purchased: " + numBooks);
		System.out.println("Book Subtotal: $" + subtotal);
		System.out.printf("Tax: $%.2f", tax); 
		System.out.println();
		System.out.printf("Shipping: $%.2f", shipping);
		System.out.println();
		System.out.printf("Order Total: $%.2f", priceOfOrder);
	}
}