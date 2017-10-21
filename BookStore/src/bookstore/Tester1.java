package bookstore;

public class Tester1 {

    public static Inventory inv = new Inventory();

    public static void main(String[] args) {
        Artist a1 = new Artist("System of a Down", "");
        CD cd1 = new CD("2001", 2, 13.53, "Toxicity", a1, 44, 1, "Columbia");
        inv.add(cd1);

        Artist a2 = new Artist("Bob", "Marley");
        CD cd2 = new CD("1979", 1, 12.99, "Survival", a2, 44, 2, "Island Records");
        inv.add(cd2);

        Artist a3 = new Artist("Eminem", "");
        CD cd3 = new CD("2013", 2, 11.99, "The Marshal Mathers LP 2", a3, 78, 1, "Interscope");
        inv.add(cd3);

        Artist a4 = new Artist("Rage Against the Machine", "");
        CD cd4 = new CD("1992", 3, 9.89, "Rage Against the Machine", a4, 55, 1, "Epic");
        inv.add(cd4);

        Artist a5 = new Artist("Kendrick", "Lamar");
        CD cd5 = new CD("2015", 1, 10.76, "To Pimp a Butterfly", a5, 78, 1, "Interscope");
        inv.add(cd5);

        Author au1 = new Author("Nicholas", "Pileggi");
        Book b1 = new Book("1985", 2, 10.89, "Wiseguys", au1, 256, 2, "Simon & Schuster");
        inv.add(b1);

        Author au2 = new Author("Nicholas", "Pileggi");
        Book b2 = new Book("1995", 1, 8.50, "Casino", au2, 363, 1, "Simon & Schuster");
        inv.add(b2);

        Author au3 = new Author("Peter", "Benchley");
        Book b3 = new Book("1974", 3, 5.67, "Jaws", au3, 278, 3, "Doubleday");
        inv.add(b3);

        Author au4 = new Author("J. D.", "Salinger");
        Book b4 = new Book("1951", 4, 9.67, "The Catcher in the Rye", au4, 214, 1, "Little, Brown and Company");
        inv.add(b4);

        Author au5 = new Author("F. Scott", "Fitzgerald");
        Book b5 = new Book("1925", 1, 8.76, "The Great Gatsby", au5, 180, 1, "Charles Scribner's Sons");
        inv.add(b5);
        
        
        
        

        System.out.println("All Items");
        inv.displayAllItems();
        System.out.println("\n");

        System.out.println("All Books");
        inv.displayAllBooks();
        System.out.println("\n");

        System.out.println("All CDs");
        inv.displayAllCDs();
        System.out.println("\n");

        System.out.println("Reorder");
        inv.reorder();
        System.out.println("\n");

        System.out.println("Total Cost");
        System.out.println(inv.totalCost());
    }

}
