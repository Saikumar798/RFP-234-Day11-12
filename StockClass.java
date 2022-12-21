package practiseProblemsDay11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StockClass {
	ArrayList<StockAEntity> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StockClass sc = new StockClass();
		System.out.println("Welcome to stock management");
		while (true) {
			System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 :
				sc.addStocks();
				break;
			case 2 :
				sc.stockReport();
				break;
			case 3 : {
				System.out.println("exiting");
				System.exit(0);
			}
			default : System.out.println("invalid input");
			}
		}
	}

	public void addStocks() {
		StockAEntity stock = new StockAEntity();
		System.out.println("Enter the stock name");
		stock.setStockNames(scanner.next());

		System.out.println("Enter the number of shares present");
		stock.setNumOfShare(scanner.nextDouble());

		System.out.println("Enter the share price");
		stock.setSharePrice(scanner.nextDouble());

		
		arrayList.add(stock);
	}

	public void stockReport() {
		int sum =0;
		System.out.println("Report of Stock");
		System.out.println("   stock name         Number of shares         Stock price        Total price of stock ");
		
		for (int i = 0; i < arrayList.size(); i++) {
			StockAEntity s = arrayList.get(i);
			double totalPrice = s.getNumOfShare() * s.getSharePrice();

			System.out.print(arrayList );
			System.out.println(totalPrice);
		

		}
	}

}
