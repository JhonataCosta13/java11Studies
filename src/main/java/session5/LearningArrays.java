package session5;

import java.util.Arrays;

public class LearningArrays {

    public static void main(String[] args) {

        Integer[] integerArray = new Integer[5];

        int[] intArray = new int[5];

        System.out.println("---------- Default Values -----------");
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        for (int i = 0; i < intArray.length; i++) {

            integerArray[i] = intArray[i] = (i + 1);
        }
        System.out.println("\n--------- Values after the Loop ----------");
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        intArray[2] = 10;
        integerArray[0] = 99;

        System.out.println("\n---------- Final Values -----------");

        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));


        int[] intArray2 = intArray;

        Integer[] integerArray2 = integerArray;

        System.out.println("\n---------- Final Values -----------");

        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        System.out.println("\n---------- Print Arrays -----------");

        System.out.println("intArray = " + intArray);
        System.out.println("intArray2 = " + intArray2);
        System.out.println("integerArray = " + integerArray);
        System.out.println("integerArray2 = " + integerArray2);

        integerArray[0] = 55;
        intArray[0] = 66;

        integerArray2[1] = 77;
        intArray2[1] = 88;

        System.out.println("\n-------- Print Array Values ---------");

        System.out.println("integerArray = " +
                Arrays.toString(integerArray));
        System.out.println("integerArray2 = " +
                Arrays.toString(integerArray2));
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));
    }
}
