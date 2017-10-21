package bookstore;

public abstract class Item {

    private String year;
    private int quantity;
    private double price;
    private String title;

    protected Item() {

    }

    protected Item(String year, int quantity, double price, String title) {
        this.year = year;
        this.quantity = quantity;
        this.price = price;
        this.title = title;
    }

    public String year() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int quantitiy() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double price() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void reorder();
}
