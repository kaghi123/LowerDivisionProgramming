package bildcomputer;

public class VideoCard {

    private String name;
    private int memorySize;
    private double price;

    public VideoCard() {

    }

    public VideoCard(String name, int memorySize, double price) {
        this.name = name;
        this.memorySize = memorySize;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String output;

        output = name + "\n"
                + "Memory Size: " + memorySize + "GB\n"
                + "Price:..............................$" + price;

        return output;
    }
}
