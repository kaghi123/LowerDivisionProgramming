package bookstore;

public class Book extends Item implements Comparable<Book> {

    private Author author;
    private int numOfPages;
    private int edition;
    private String publisher;

    public Book() {

    }

    public Book(String year, int quantity, double price, String title, Author author, int numOfPages, int edition, String publisher) {
        super(year, quantity, price, title);

        this.author = author;
        this.numOfPages = numOfPages;
        this.edition = edition;
        this.publisher = publisher;

        setYear(year);
        setQuantity(quantity);
        setPrice(price);
        setTitle(title);
    }

    public Book(Book b) {
        this(b.edition, b.numOfPages, b.publisher, new Author(b.author));
    }

    public Author author() {
        return author;
    }

    public int numOfPages() {
        return numOfPages;
    }

    public int edition() {
        return edition;
    }

    public String publisher() {
        return publisher;
    }

    public String toString() {
        String output;

        output = "Title:           " + super.title() + "\n" + author.toString() + "\nYear:            " + super.year() + "\nEdition:         " + edition + "\nNumber of Pages: " + numOfPages + "\nPublisher:       " + publisher;

        return output;
    }

    public void reorder() {
        String output;

        output = "Title:           " + super.title() + "\n" + author.toString() + "\nPublisher:       " + publisher + "\n";
    }

    public int compareTo(Book o1) {
        if (this.author.lastName().equals(o1.author.lastName())) {
            if (this.author.firstName().equals(o1.author.firstName())) {
                if (this.title().equals(o1.title())) {

                }
                return this.title().compareTo(o1.title());
            }
            return this.author.firstName().compareTo(o1.author.firstName());
        }
        return this.author.lastName().compareTo(o1.author.lastName());
    }

}
