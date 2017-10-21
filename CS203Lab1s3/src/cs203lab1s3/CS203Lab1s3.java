package cs203lab1s3;

public class CS203Lab1s3 {

    public static void main(String[] args) {
        double[] list = {7, 4, 6, 3, 1, 8, 9, 4, 10, 11, 34};
        sort(list);
    }

    public static void sort(double[] list) {

        for (int i = 0; i < list.length; i++) {
            double lowestNum = -1;
            int lowestNumIndex = 0;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    if (lowestNum < 0) {
                        lowestNum = list[j];
                        lowestNumIndex = j;
                    } else if (list[j] < lowestNum) {
                        lowestNum = list[j];
                        lowestNumIndex = j;
                    }
                }

            }
            if(lowestNum >= 0){
            double temp = list[i];
            list[i] = lowestNum;
            list[lowestNumIndex] = temp;
            }
        }

        //display list
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
