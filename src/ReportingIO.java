import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportingIO {
    private static Scanner k = new Scanner(System.in);
    private static List<AuctionHouse> auctionHouses = new ArrayList<>();
public static void main(String[] args) {
        System.out.println("Welcome to the Auction House reporting system!");

        System.out.println("Enter name of auctionhouse!!!!!");
        String name = k.nextLine();
        AuctionHouse auctionHouse = new AuctionHouse(name);
        auctionHouses.add(auctionHouse);

        while (true) {
        System.out.println("Please choose from the following options:");
        System.out.println("a. Add a sold item");
        System.out.println("b. Get the  item with the highest price");
        System.out.println("c. Get the average price by year");
        System.out.println("d. Get items with price greater than a certain amount");
        System.out.println("e. See a list of all items sold");
        System.out.println("escp. Exit the program");

        String choice = k.nextLine();
        k.nextLine();

        switch (choice) {
        case "a":
        Item item = Item.getItemFrom();
        auctionHouse.addSoldItem(item);
        System.out.println(" Item added successfully!");
        break;
        case "b":
        Item highestPriceItem = auctionHouse.getHighestPriceItem();
        if (highestPriceItem !=   null) {
        System.out.println("The item with the highest price is:");
        highestPriceItem.ItemDisplay();
        } else {
        System.out.println("No items have been sold yet.");
        }
        break;
        case"c":
        System.out.println("Please enter the year:");
        int year = k.nextInt();
        k.nextLine();
        float averagePrice = auctionHouse.getAveragePrice(year);
        if (averagePrice > 0) {
        System.out.println("average price for thid year " + year + " is: " + averagePrice);
        } else {
        System.out.println("No items were sold in this year " + year + ".");
        }
        break;
        case "d":
        System.out.println(" enter the minimum price:");
        float price = k.nextFloat();
        k.nextLine();
        List<Item> items = auctionHouse.getItemsPriceThan(price);
        if (!items.isEmpty()) {
        System.out.println("The following items have a price greater than " + price + ":");
        for (Item q : items) {
        q.ItemDisplay();
        }
        } else {
        System.out.println("No items were sold with a price greater than " + price + ".");
        }
        break;
        case "e":
        List<Item> soldItems = auctionHouse.getAllSoldItems();
        if (!soldItems.isEmpty()) {
        System.out.println("Here is a list of all items sold:");
        for (Item m : soldItems) {
        m.ItemDisplay();
        }
        } else {
        System.out.println("No items have been sold yet.");
        }
        break;
        case "escp":
        System.out.println("Thank you for using the Auction House Reporting System. Goodbye!");
        System.exit(0);
        break;
default:
        System.out.println("Invalid choice. Please try again.");
        break;
        }
        }
        }}