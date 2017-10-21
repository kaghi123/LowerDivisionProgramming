package cs203lab1s2;

public class CS203Lab1s2 {

    public static void main(String[] args) {
        reverseDisplay("abcde");
    }

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int lastIndex) {
        if (lastIndex < 0) {

        } else {
            System.out.println(value.charAt(lastIndex));
            reverseDisplay(value, lastIndex - 1);
        }
    }

}
