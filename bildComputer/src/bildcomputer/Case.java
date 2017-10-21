package bildcomputer;

public class Case {

    private String name;
    private double hight;
    private double width;
    private double depth;
    private String type;
    private double price;

    public Case() {

    }

    public Case(String name, double hight, double width, double depth, String type, double price) {
        this.name = name;
        this.hight = hight;
        this.width = width;
        this.depth = depth;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String output;

        output = name + "\n"
                + "Dimensions: " + hight + "'' x " + width + "'' x " + depth + "'' (H, W, D)\n"
                + "Type: " + type + "\n"
                + "Price:..............................$" + price;

        return output;
    }
}
