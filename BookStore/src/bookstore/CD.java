package bookstore;

public class CD extends Item implements Comparable<CD> {

    private Artist artist;
    private int runningLength;
    private int numOfDisks;
    private String lable;

    public CD() {

    }

    public CD(String year, int quantity, double price, String title, Artist artist, int runningLength, int numOfDisks, String lable) {
        super(year, quantity, price, title);

        this.artist = artist;
        this.runningLength = runningLength;
        this.numOfDisks = numOfDisks;
        this.lable = lable;

        setYear(year);
        setQuantity(quantity);
        setPrice(price);
        setTitle(title);
    }

    public CD(CD cd) {
        this(cd.lable, cd.numOfDisks, cd.runningLength, new Artist(cd.artist));
    }

    public Artist artist() {
        return artist;
    }

    public int runningLength() {
        return runningLength;
    }

    public int numOfDisks() {
        return numOfDisks;
    }

    public String lable() {
        return lable;
    }

    public String toString() {
        String output;

        output = "Title:           " + super.title() + "\n" + artist.toString() + "\nYear:            " + super.year() + "\nRunning Length:  " + runningLength + "\nNumber of Disks: " + numOfDisks + "\nRecord Lable:    " + lable;

        return output;
    }

    public void reorder() {
        String output;

        output = "Title:           " + super.title() + "\n" + artist.toString() + "\nRecord Lable:    " + lable + "\n";
    }

    @Override
    public int compareTo(CD o1) {
        if (this.artist.lastName().equals(o1.artist.lastName())) {
            if (this.artist.firstName().equals(o1.artist.firstName())) {
                if (this.title().equals(o1.title())) {

                }
                return this.title().compareTo(o1.title());
            }
            return this.artist.firstName().compareTo(o1.artist.firstName());
        }
        return this.artist.lastName().compareTo(o1.artist.lastName());
    }
}
