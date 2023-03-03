import java.util.Scanner;public class Item {
    private int ItemId;
    private String NameOBuyer;
    private float SoldPrice;
    private int YearSold;
    private String type;

    // Constructor
    public Item(String NameOBuyer, int ItemID, float SoldPrice, int YearSold, String type) {
        this.ItemId= ItemId;
        this.NameOBuyer = NameOBuyer;
        this.SoldPrice = SoldPrice;
        this.YearSold = YearSold;
        this.type = type;
    }

    // Getters and Setters
    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    public String getNameOBuyer() {
        return NameOBuyer;
    }

    public void setNameOBuyerr(String buyerName) {
        this.NameOBuyer = NameOBuyer;
    }

    public double getSoldPrice() {
        return SoldPrice;
    }

    public void setSoldPrice(float SoldPrice) {
        this.SoldPrice = SoldPrice;
    }

    public int getYearSold() {
        return YearSold;
    }

    public void setYearSold(int year) {
        this.YearSold = YearSold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Item getItemFrom() {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter Item ID:");
        int itemId = t.nextInt();
        t.nextLine();
        System.out.println("Enter buyer name:");
        String buyerName = t.nextLine();
        System.out.println("Enter price:");
        float soldPrice = t.nextFloat();
        System.out.println("Enter year:");
        int yearSold = t.nextInt();
        t.nextLine();
        System.out.println("Enter type (furniture/painting/sculpture):");
        String type = t.nextLine();

        Item item = new Item(buyerName, itemId, soldPrice, yearSold, type);
        return item;
    }

    // Method to display information about the item
    public void ItemDisplay() {
        System.out.println("Item ID: " + ItemId);
        System.out.println("Buyer name: " + NameOBuyer);
        System.out.println("Price: " + SoldPrice);
        System.out.println("Year: " + YearSold);
        System.out.println("Type: " + type);
    }
}

