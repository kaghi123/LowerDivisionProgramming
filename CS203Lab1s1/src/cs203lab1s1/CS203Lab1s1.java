package cs203lab1s1;

public class CS203Lab1s1 {

    public static void main(String[] args) {
        reverseDisplay(12345);
    }

    public static void reverseDisplay(int value) {
        if (value == 0) {

        } else {
            System.out.println(value % 10);
            value = (int) (value / 10);
            reverseDisplay(value);
        }
    }

}
