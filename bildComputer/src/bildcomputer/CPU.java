package bildcomputer;

public class CPU {

    private String name;
    private double speed;
    private double price;

    public CPU() {

    }

    public CPU(String name, double speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String output;

        output = name + "\n"
                + "Speed: " + speed + "GHz\n"
                + "Price:..............................$" + price;

        return output;
    }
}
