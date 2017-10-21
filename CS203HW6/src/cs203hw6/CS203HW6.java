package cs203hw6;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CS203HW6 extends Application {

    Integer[] list = {50000, 100000, 150000, 200000, 250000, 300000};
    static int c;
    static int r;
    static int j;
    static GridPane gpane = new GridPane();

    @Override
    public void start(Stage primaryStage) {

        BorderPane bp = new BorderPane();

        gpane.setGridLinesVisible(true);
        gpane.setHgap(95);
        gpane.setVgap(23);
        bp.setCenter(gpane);

        Label arraysize = new Label("ArraySize");
        gpane.add(arraysize, 0, 0);
        Label l1 = new Label("Selection Sort");
        gpane.add(l1, 1, 0);
        Label l2 = new Label("Insertion Sort");
        gpane.add(l2, 2, 0);
        Label l3 = new Label("Bubble Sort");
        gpane.add(l3, 3, 0);
        Label l4 = new Label("Merge Sort");
        gpane.add(l4, 4, 0);
        Label l5 = new Label("Quick Sort");
        gpane.add(l5, 5, 0);
        Label l6 = new Label("Heap Sort");
        gpane.add(l6, 6, 0);
        Label l7 = new Label("50000");
        gpane.add(l7, 0, 1);
        Label l8 = new Label("100000");
        gpane.add(l8, 0, 2);
        Label l9 = new Label("150000");
        gpane.add(l9, 0, 3);
        Label l10 = new Label("200000");
        gpane.add(l10, 0, 4);
        Label l11 = new Label("250000");
        gpane.add(l11, 0, 5);
        Label l12 = new Label("300000");
        gpane.add(l12, 0, 6);

        for (j = 0, c = 1, r = 1; j < list.length; j++, c++) {
            Random generator = new Random();
            int max = 100;
            Integer[] tempList;
            tempList = new Integer[list[j]];

            for (int i = 0; i < tempList.length; i++) {
                tempList[i] = generator.nextInt(max);
            }

            selectionSort(tempList);
            r++;
            insertionSort(tempList);
            r++;
            bubbleSort(tempList);
            r++;
            mergeSort(tempList);
            r++;
           //quickSort(tempList);  
           //quicksort only works with smaller numbers, when i use the larger numbers it crashes
            r++;
            heapSort(tempList);
            r = 1;
        }

        Scene scene = new Scene(bp, 1000, 500);
        primaryStage.setTitle("SortingTime");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static <E extends Comparable<E>> void selectionSort(E[] list) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.length - 1; i++) {
            int temp = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[temp].compareTo((list[j])) > 0) {
                    temp = j;
                }
            }
            E swap = list[temp];
            list[temp] = list[i];
            list[i] = swap;

        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Label temp1 = new Label(Long.toString(executionTime));
        gpane.add(temp1, r, c);

    }

    public static <E extends Comparable<E>> void insertionSort(E[] list) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < list.length; i++) {

            E currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--) {
                list[k + 1] = list[k];

            }

            list[k + 1] = (E) currentElement;

        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Label temp2 = new Label(Long.toString(executionTime));
        gpane.add(temp2, r, c);
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {

        long startTime = System.currentTimeMillis();

        for (int k = 1; k < list.length; k++) {
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    E swap = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = swap;
                }
            }

        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Label temp3 = new Label(Long.toString(executionTime));
        gpane.add(temp3, r, c);
    }

    public static <E extends Comparable<E>> void mergeSort(Integer[] list) {

        long startTime = System.currentTimeMillis();

        long time = startTime;

        mergeSort1(list);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - time;

        Label temp4 = new Label(Long.toString(executionTime));
        gpane.add(temp4, r, c);
    }

    public static void mergeSort1(Integer[] list) {

        if (list.length > 1) {
            Integer[] firstHalf = new Integer[list.length / 2];

            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort1(firstHalf);

            Integer secondHalfLength = list.length - list.length / 2;
            Integer[] secondHalf = new Integer[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort1(secondHalf);

            merge(firstHalf, secondHalf, list);

        }

    }

    public static void merge(Integer[] list1, Integer[] list2, Integer[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }

        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }

    }

    public static <E extends Comparable<E>> void quickSort(Integer[] list) {

        long startTime = System.currentTimeMillis();

        quickSort1(list, 0, list.length - 1);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Label temp5 = new Label(Long.toString(executionTime));

        gpane.add(temp5, r, c);

    }

    public static void quickSort1(Integer[] list, Integer first, Integer last) {
        if (last > first) {
            Integer pivotIndex = partition(list, first, last);
            quickSort1(list, first, pivotIndex - 1);
            quickSort1(list, pivotIndex + 1, last);
        }
    }

    public static Integer partition(Integer[] list, Integer first, Integer last) {
        Integer pivot = list[first];
        Integer low = first + 1;
        Integer high = last;

        while (high > low) {

            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {

        long startTime = System.currentTimeMillis();

        Heap<E> heap = new Heap<>();

        for (int i = 0; i < list.length; i++) {
            heap.add(list[i]);
        }

        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Label temp6 = new Label(Long.toString(executionTime));
        gpane.add(temp6, r, c);
    }

}
