package bildcomputer;

public class Computer {

    public static String[] compParts = new String[6];
    public static double[] compPartsPrice = new double[6];
    private Case towerCase;
    private Monitor monitor;
    private CPU cpu;
    private VideoCard videoCard;
    private HardDrive hardDrive;
    private Memory memory;

    public Computer() {

    }

    public Computer(Case towerCase, Monitor monitor, CPU cpu, VideoCard videoCard, HardDrive hardDrive, Memory memory) {
        this.towerCase = towerCase;
        this.monitor = monitor;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    public Case getTowerCase() {
        return towerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Memory getMemory() {
        return memory;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < 6; i++) {
            totalCost = totalCost + compPartsPrice[i];
        }
        return totalCost;
    }

    public void displayReceipt() {

        Case ca1 = new Case("Antec Twelve Hundred V3", 22.87, 8.39, 20.20, "ATX Full Tower", 154.99);
        Case ca2 = new Case("Corsair 250D", 11.4, 10.9, 13.8, "MiniITX Tower", 99.9);
        Case ca3 = new Case("BitPhenix Phenom M Arctic White", 14.69, 12.95, 9.80, "MicroATX Mini Tower", 89.99);
        Case ca4 = new Case();

        Monitor mon1 = new Monitor("Asus PB278Q", 27, 549.99);
        Monitor mon2 = new Monitor("Dell U2412M", 24, 263.99);
        Monitor mon3 = new Monitor("Samsung S22C300H", 21.5, 139.99);
        Monitor mon4 = new Monitor();

        CPU cpu1 = new CPU("AMD FX-8350", 4.0, 188.99);
        CPU cpu2 = new CPU("Intel Core i5-3570K", 3.4, 179.99);
        CPU cpu3 = new CPU("Intel Core i7-3770K", 3.5, 249.99);
        CPU cpu4 = new CPU();

        VideoCard vc1 = new VideoCard("Nvidia GeForce GTX 770", 2, 346.99);
        VideoCard vc2 = new VideoCard("AMD Radeon HD 7950", 3, 399.99);
        VideoCard vc3 = new VideoCard("Nvidia GeForce GTX 670", 2, 333.99);
        VideoCard vc4 = new VideoCard();

        HardDrive hd1 = new HardDrive("Samsung MZ-7PD256BW", 256, 199.99);
        HardDrive hd2 = new HardDrive("Crucial CT128M4SSD1", 128, 199.95);
        HardDrive hd3 = new HardDrive("Corsair CSSD-F240GBGT-BK", 240, 206.99);
        HardDrive hd4 = new HardDrive();

        Memory m1 = new Memory("Corsair Vengeance", 8, 69.99);
        Memory m2 = new Memory("G.Skill Ares Series", 16, 149.99);
        Memory m3 = new Memory("Kingston Black Series", 8, 79.99);
        Memory m4 = new Memory();

        System.out.println("********************Recept********************");
        for (int i = 0; i < 6; i++) {
            System.out.println(compParts[i]);
        }
        System.out.println("Total Cost: $" + getTotalCost() + "\n");
    }
}
