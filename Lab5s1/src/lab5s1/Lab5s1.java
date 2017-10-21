package lab5s1;

public class Lab5s1 {

    public static void main(String[] args) {
       Integer[] list = {3,5,1,8,9,7,2};
       
       insertionSort(list);
       
    }

    public static <E extends Comparable<E>> void insertionSort(E[] list) {
        for (int i = 1; i < list.length; i++) {
            
            E currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--) {
                list[k + 1] = list[k];

            }

            list[k + 1] = (E) currentElement;
            
            
        }
        for(int i = 0; i < list.length; i++){
                System.out.print(list[i] + " ");
            }
    }
}
