package custombiginteger;

import java.util.Arrays;

public class CustomBigInteger {
    
    private final String integer1;
    private final String integer2;
    int num1;
    int num2;
    int originalnum1;
    int originalnum2;
    int[] theSumArray;
    int[] theDiffArray;
    
    
    public CustomBigInteger(String integer1, String integer2) {
         this.integer1 = integer1;
         this.integer2 = integer2;
    }      
    
    
    public void parseBigInt(String integer1, String integer2, int[] CustomBigIntegerArray1, int[] CustomBigIntegerArray2) {
        
        int array1length = 0;
        int array2length = 0;
        
        if(integer1.length() > 50){
            System.out.println("Error: cannot have more the 50 numbers!");
            return;
        }
        if(integer1.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
        num1 = Integer.parseInt(integer1);
        originalnum1 = Integer.parseInt(integer1);
        }
        else{
            System.out.println("Error: only input numbers!");
            return;
        }
        
        if(integer2.length() > 50){
            System.out.println("Error: cannot have more the 50 numbers!");
            return;
        }
        if(integer2.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
        num2 = Integer.parseInt(integer2);
        originalnum2 = Integer.parseInt(integer2);
        }
        else{
            System.out.println("Error: only input numbers!");
            return;
        }
        
      
        for(int i = 0; i < CustomBigIntegerArray1.length; i++) {
            
            CustomBigIntegerArray1[i] = num1%10;
            num1= num1/10;
            array1length++;
        }
        
        for(int i = 0; i < CustomBigIntegerArray2.length; i++) {
            CustomBigIntegerArray2[i] = num2%10;
            num2= num2/10;
            array2length++;
        }   
    }
    
    public int[] add(int[] CustomBigIntegerArray1, int[] CustomBigIntegerArray2) {
        
        int smallSum;
        int sumNum =0;
        int carryOver = 0;
        int sumArrayLengthnum = (originalnum1 + originalnum2);
        int sumArrayLength =  (Integer.toString(sumArrayLengthnum)).length();
        int[] CustomBigIntegerArray3 = new int [sumArrayLength];
        theSumArray = new int [sumArrayLength];
        
        
        for(int i = 0; i < sumArrayLength; i++) {
        smallSum = CustomBigIntegerArray1[i] + CustomBigIntegerArray2[i] + carryOver;
        
        if(smallSum >= 10) {
            sumNum = smallSum%10;
        }
        else sumNum = smallSum;
        
        CustomBigIntegerArray3[i] = sumNum;
        carryOver = smallSum/10;
        smallSum = 0;
        
       }      
        
        int j = 0;
        for (int i = sumArrayLength - 1; i >= 0 ; i--){
           theSumArray[j] = CustomBigIntegerArray3[i];
           j++;
        }
        
        return theSumArray;
    }
    
    public int[] subtract(int[] CustomBigIntegerArray1, int[] CustomBigIntegerArray2) {
        int smallDiff;
        int diffArrayLengthnum = (originalnum1 - originalnum2);
        int diffArrayLength =  (Integer.toString(diffArrayLengthnum)).length();
        int[] CustomBigIntegerArray4 = new int [diffArrayLength];
        theDiffArray = new int [diffArrayLength];
        
        for(int i = 0; i < diffArrayLength; i++){
            if(CustomBigIntegerArray1[i] < CustomBigIntegerArray2[i]){
                if(CustomBigIntegerArray1[i + 1] == 0){
                    CustomBigIntegerArray1[i + 1] = 9;
                }
                CustomBigIntegerArray1[i + 1] = CustomBigIntegerArray1[i + 1] - 1;
                CustomBigIntegerArray1[i] = CustomBigIntegerArray1[i] + 10;
            }
            
           smallDiff = CustomBigIntegerArray1[i] - CustomBigIntegerArray2[i];
           CustomBigIntegerArray4[i] = smallDiff;
           smallDiff = 0;
        }
        
        int j = 0;
        for (int i = diffArrayLength - 1; i >= 0 ; i--){
           theDiffArray[j] = CustomBigIntegerArray4[i];
           j++;
        }
        
        return theDiffArray;
    }
    
   
    
    public void toString(int[] theSumArray, int[] theDiffArray) {
       
        System.out.print("\nThe sum is: ");
        for(int i = 0; i < theSumArray.length; i++) {
        System.out.print(theSumArray[i]);
        }
        
        System.out.print("\nThe difference is: ");
        for(int i = 0; i < theDiffArray.length; i++) {
        System.out.print(theDiffArray[i]);
        }
        System.out.println("\n");
    } 
}

