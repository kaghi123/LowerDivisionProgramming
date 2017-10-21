package lab5s2;

public class Lab5s2 {

    public static void main(String[] args) {
        Integer[] list = {3, 5, 1, 8, 9, 7, 2};

        bubbleSort(list);
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {

        for (int k = 1; k < list.length; k++) {
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i + 1]) > 0 ) {
                        E swap = list[i];
                        list[i] = list[i+1];
                        list[i+1] = swap;
                }
            }

        }
        for(int i = 0; i < list.length; i++){
                System.out.print(list[i] + " ");
            }
    }

}
