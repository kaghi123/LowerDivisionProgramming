package bildcomputer;

public class Monitor {

    private String name;
    private double size;
    private double price;

    public Monitor() {

    }

    public Monitor(String name, double size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String output;

        output = name + "\n"
                + "Size: " + size + "''\n"
                + "Price:..............................$" + price;

        return output;
    }
}
