package custombiginteger;
import java.util.Scanner;
public class CustomBigIntegertester {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    int[] CustomBigIntegerArray1 = new int [50];
    int[] CustomBigIntegerArray2 = new int [50];
        
    System.out.println("Enter 2 Large Integers");
    System.out.println("Integer 1: ");
    String integer1 = input.next();
    System.out.println("Integer 2:");
    String integer2 = input.next();
    
    CustomBigInteger cbi = new CustomBigInteger(integer1, integer2);
    cbi.parseBigInt(integer1, integer2, CustomBigIntegerArray1, CustomBigIntegerArray2);
    cbi.add(CustomBigIntegerArray1, CustomBigIntegerArray2);
    cbi.subtract(CustomBigIntegerArray1, CustomBigIntegerArray2);
    cbi.toString(cbi.theSumArray, cbi.theDiffArray);
       
    }
    
}
