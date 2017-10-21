package cs203lab1s4;

public class CS203Lab1s4 {

    public static void main(String[] args) {
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        recursiveBinarySearch(list, 16);
    }

    public static void recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int mid = (low + high) / 2;

        for (int i = 0; i < list.length; i++) {
            if (list[mid] == key) {
                System.out.println("The key is at index " + mid);
                break;
            } else if (list[mid] > key) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else {
                low = mid + 1;
                mid = (low + high) / 2;
            }

        }

    }

}
