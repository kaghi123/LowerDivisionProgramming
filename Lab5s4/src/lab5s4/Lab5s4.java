package lab5s4;

public class Lab5s4 {

    public static void main(String[] args) {
        Integer[] list = {3, 5, 1, 8, 9, 7, 2};

        heapSort(list);
    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>();

        for (int i = 0; i < list.length; i++) {
            heap.add(list[i]);
        }

        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
