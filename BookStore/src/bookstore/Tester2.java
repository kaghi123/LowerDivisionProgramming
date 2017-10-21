package bookstore;

import java.util.Arrays;

public class Tester2 {

    public static void main(String[] args) {
        Book[] BookArray = new Book[7];
        CD[] CDArray = new CD[7];

        Artist a1 = new Artist("System of a Down", "");
        CD cd1 = new CD("2001", 2, 13.53, "Toxicity", a1, 44, 1, "Columbia");
        CDArray[0] = cd1;

        CD cd2 = new CD("2002", 1, 12.53, "Steal this Album!", a1, 43, 1, "Columbia");
        CDArray[1] = cd2;

        CD cd3 = new CD("2005", 3, 12.00, "Mezmerize", a1, 36, 1, "Columbia");
        CDArray[2] = cd3;

        Artist a2 = new Artist("Bob", "Marley");
        CD cd4 = new CD("1979", 1, 12.99, "Survival", a2, 44, 2, "Island Records");
        CDArray[3] = cd4;

        Artist a3 = new Artist("Eminem", "");
        CD cd5 = new CD("2013", 2, 11.99, "The Marshal Mathers LP 2", a3, 78, 1, "Interscope");
        CDArray[4] = cd5;

        Artist a4 = new Artist("Rage Against the Machine", "");
        CD cd6 = new CD("1992", 3, 9.89, "Rage Against the Machine", a4, 55, 1, "Epic");
        CDArray[5] = cd6;

        Artist a5 = new Artist("Jimi", "Hendrix");
        CD cd7 = new CD("1968", 2, 9.13, "Electric Ladyland", a5, 80, 2, "Reprise");
        CDArray[6] = cd7;

        Author au1 = new Author("Peter", "Benchley");
        Book b1 = new Book("1974", 3, 5.67, "Jaws", au1, 278, 3, "Doubleday");
        BookArray[0] = b1;

        Author au2 = new Author("J. D.", "Salinger");
        Book b2 = new Book("1951", 4, 9.67, "The Catcher in the Rye", au2, 214, 1, "Little, Brown and Company");
        BookArray[1] = b2;

        Author au3 = new Author("F. Scott", "Fitzgerald");
        Book b3 = new Book("1925", 1, 8.76, "The Great Gatsby", au3, 180, 1, "Charles Scribner's Sons");
        BookArray[2] = b3;

        Author au4 = new Author("J.K", "Rowling");
        Book b4 = new Book("1998", 1, 11.15, "Harry Potter and the Sorcerer's Stone", au4, 309, 1, "Scholastic");
        BookArray[3] = b4;

        Book b5 = new Book("1999", 1, 11.79, "Harry Potter and the Chamber of Secrets", au4, 341, 1, "Scholastic");
        BookArray[4] = b5;

        Book b6 = new Book("1999", 1, 12.79, "Harry Potter and the Prisoner of Azkaban", au4, 435, 1, "Scholastic");
        BookArray[5] = b6;

        Book b7 = new Book("2000", 1, 13.79, "Harry Potter and the Goblet of Fire", au4, 734, 1, "Scholastic");
        BookArray[6] = b7;

        System.out.println("Not Sorted\n");
        for (int i = 0; i < BookArray.length; i++) {
            System.out.println(BookArray[i].toString());
            System.out.println("\n");
        }

        System.out.println("\n");

        for (int i = 0; i < CDArray.length; i++) {
            System.out.println(CDArray[i].toString());
            System.out.println("\n");
        }

        Arrays.sort(BookArray);
        Arrays.sort(CDArray);

        System.out.println("\nSorted\n");
        for (int i = 0; i < BookArray.length; i++) {
            System.out.println(BookArray[i].toString());
            System.out.println("\n");
        }

        System.out.println("\n");

        for (int i = 0; i < CDArray.length; i++) {
            System.out.println(CDArray[i].toString());
            System.out.println("\n");
        }

    }

}
