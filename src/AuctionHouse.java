import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {
    private String nameofauction;
    private List<Item> soldItems;

    public AuctionHouse(String name) {
        this.nameofauction = name;
        soldItems = new ArrayList<>();
    }

    public String getName() {
        return nameofauction;
    }

    public void addSoldItem(Item item) {
        soldItems.add(item);
    }

    public Item getHighestPriceItem() {
        Item highestPriceItem = null;
        float highestPrice = 0;
        for (Item item : soldItems) {
            if (item.getSoldPrice() > highestPrice) {
                highestPrice = (float) item.getSoldPrice();
                highestPriceItem = item;
            }
        }
        return highestPriceItem;
    }

    public float getAveragePrice(int year) {
        float totalp = 0;
        int counter = 0;
        for (Item item : soldItems) {
            if (item.getYearSold() == year) {
                totalp += item.getSoldPrice();
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return totalp / counter;
    }

    public List<Item> getItemsPriceThan(float price) {
        List<Item> items = new ArrayList<>();
        for (Item item : soldItems) {
            if (item.getSoldPrice() > price) {
                items.add(item);
            }
        }
        return items;
    }

    public List<Item> getAllSoldItems() {
        return soldItems;
    }
}
