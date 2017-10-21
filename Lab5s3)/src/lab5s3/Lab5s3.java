package lab5s3;

public class Lab5s3 {

    public static <E extends Comparable<E>> void mergeSort(Integer[] list) {
        if (list.length > 1) {
            Integer[] firstHalf = new Integer[list.length / 2];
            
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            Integer secondHalfLength = list.length - list.length / 2;
            Integer[] secondHalf = new Integer[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

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

    public static void main(String[] args) {
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        mergeSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    
}
