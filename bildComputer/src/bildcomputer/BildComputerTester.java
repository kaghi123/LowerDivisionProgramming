package bildcomputer;

import java.util.Scanner;

public class BildComputerTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        String smallOption;

        Computer comp = new Computer();

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

        boolean keepGoing = true;

        while (keepGoing) {
            mainMenu();
            option = input.next();

            switch (option) {
                case "1":
                    System.out.println("********************Case Menu********************\n1. " + ca1.toString() + "\n2. " + ca2.toString() + "\n3. " + ca3.toString() + "\n");
                    System.out.println("Please choose a Case: ");
                    smallOption = input.next();
                    switch (smallOption) {
                        case "1":
                            comp.compParts[0] = (ca1.toString());
                            comp.compPartsPrice[0] = (ca1.getPrice());
                            break;
                        case "2":
                            comp.compParts[0] = (ca2.toString());
                            comp.compPartsPrice[0] = (ca2.getPrice());
                            break;
                        case "3":
                            comp.compParts[0] = (ca3.toString());
                            comp.compPartsPrice[0] = (ca3.getPrice());
                            break;
                    }
                    break;
                case "2":
                    System.out.println("********************Monitor Menu********************\n1. " + mon1.toString() + "\n2. " + mon2.toString() + "\n3. " + mon3.toString() + "\n");
                    System.out.println("Please choose a Monitor: ");
                    smallOption = input.next();
                    switch (smallOption) {
                        case "1":
                            comp.compParts[1] = (mon1.toString());
                            comp.compPartsPrice[1] = (mon1.getPrice());
                            break;
                        case "2":
                            comp.compParts[1] = (mon2.toString());
                            comp.compPartsPrice[1] = (mon2.getPrice());
                            break;
                        case "3":
                            comp.compParts[1] = (mon3.toString());
                            comp.compPartsPrice[1] = (mon3.getPrice());
                            break;
                    }
                    break;
                case "3":
                    System.out.println("********************CPU********************\n1. " + cpu1.toString() + "\n2. " + cpu2.toString() + "\n3. " + cpu3.toString() + "\n");
                    System.out.println("Please choose a CPU: ");
                    smallOption = input.next();
                    switch (smallOption) {
                        case "1":
                            comp.compParts[2] = (cpu1.toString());
                            comp.compPartsPrice[2] = (cpu1.getPrice());
                            break;
                        case "2":
                            comp.compParts[2] = (cpu2.toString());
                            comp.compPartsPrice[2] = (cpu2.getPrice());
                            break;
                        case "3":
                            comp.compParts[2] = (cpu3.toString());
                            comp.compPartsPrice[2] = (cpu3.getPrice());
                            break;
                    }
                    break;
                case "4":
                    System.out.println("********************Video Card********************\n1. " + vc1.toString() + "\n2. " + vc2.toString() + "\n3. " + vc3.toString() + "\n");
                    System.out.println("Please choose a Video Card: ");
                    smallOption = input.next();
                    switch (smallOption) {
                        case "1":
                            comp.compParts[3] = (vc1.toString());
                            comp.compPartsPrice[3] = (vc1.getPrice());
                            break;
                        case "2":
                            comp.compParts[3] = (vc2.toString());
                            comp.compPartsPrice[3] = (vc2.getPrice());
                            break;
                        case "3":
                            comp.compParts[3] = (vc3.toString());
                            comp.compPartsPrice[3] = (vc3.getPrice());
                            break;
                    }
                    break;
                case "5":
                    System.out.println("********************Hard Drive********************\n1. " + hd1.toString() + "\n2. " + hd2.toString() + "\n3. " + hd3.toString() + "\n");
                    System.out.println("Please choose a Hard Drive: ");
                    smallOption = input.next();
                    switch (smallOption) {
                        case "1":
                            comp.compParts[4] = (hd1.toString());
                            comp.compPartsPrice[4] = (hd1.getPrice());
                            break;
                        case "2":
                            comp.compParts[4] = (hd2.toString());
                            comp.compPartsPrice[4] = (hd2.getPrice());
                            break;
                        case "3":
                            comp.compParts[4] = (hd3.toString());
                            comp.compPartsPrice[4] = (hd3.getPrice());
                            break;
                    }
                    break;
                case "6":
                    System.out.println("********************Memory********************\n1. " + m1.toString() + "\n2. " + m2.toString() + "\n3. " + m3.toString() + "\n");
                    System.out.println("Please choose a Memory: ");
                    smallOption = input.next();
                    switch (smallOption) {
                        case "1":
                            comp.compParts[5] = (m1.toString());
                            comp.compPartsPrice[5] = (m1.getPrice());
                            break;
                        case "2":
                            comp.compParts[5] = (m2.toString());
                            comp.compPartsPrice[5] = (m2.getPrice());
                            break;
                        case "3":
                            comp.compParts[5] = (m3.toString());
                            comp.compPartsPrice[5] = (m3.getPrice());
                            break;
                    }
                    break;
                case "7":
                    
                    for(int i = 0; i < 6; i++){
                        comp.compParts[i] = "";
                    }
                    
                    for(int i = 0; i < 6; i++){
                        comp.compPartsPrice[i] = 0;
                    }
                    break;
                case "8":
                    comp.displayReceipt();
                    break;
                case "9":
                    keepGoing = false;
                    break;
                default:
                    break;

            }
        }

    }

    public static void mainMenu() {
        System.out.println("***********Main Menu***********\n1. Choose a Case\n2. Choose a Monitor\n3. Choose a CPU\n4. Choose a Video Card\n5. Choose a Hard Drive\n6. Choose a Memory\n7. Delete Current Program\n8. Display Receipt\n9. Exit Program\n********************************");
        System.out.println("Please choose your option to build your computer: ");
    }

}
