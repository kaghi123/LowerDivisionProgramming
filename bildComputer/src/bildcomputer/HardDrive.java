package bildcomputer;

public class HardDrive {

    private String name;
    private int size;
    private double price;

    public HardDrive() {

    }

    public HardDrive(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String output;

        output = name + "\n"
                + "Size: " + size + "GB\n"
                + "Price:..............................$" + price;

        return output;
    }
}
