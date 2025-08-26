package linearDS.array_ds;

import java.util.Arrays;

public class BasicArrayOp {
    public static void main(String[] args) {
        //array dec and init
        int[] testArr = new int[5];
        testArr[0] = 1;
        testArr[1] = 2;
        testArr[2] = 3;

        for (int i=0; i<testArr.length; i++){
            System.out.println("testArr[" + i + "] = " + testArr[i]);
        }


        int[] marks = {85,90,78,88,76};
        System.out.println("After Init:");
        for (int i=0; i<marks.length; i++){
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        //place: replace or update any index value

        int a = 10;
        int indexNo = 2;
        marks[indexNo] = a;

        System.out.println("After update/ insert in place:");
        for (int i=0; i<marks.length; i++){
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
        int b = 50;
        int indexShift =2;

        int testArrSize = testArr.length;
        //when elements are less than array size
        for(int i = testArrSize-1; i>indexShift; i--){
            testArr[i] = testArr[i-1];
        }
        testArr[indexShift] = b;
        System.out.println("Array after right shift, test array:" + Arrays.toString(testArr));

        // when array elements are full of array size
        int[] copy = new int[marks.length+1];

        //manually
//        for (int i= 0;i< marks.length;i++){
//            copy[i] = marks[i];
//        }
//        //build in approach
//        System.arraycopy(marks,0,copy,0,marks.length);

//        //copyOf
        copy = Arrays.copyOf(marks, marks.length+1);
        for (int i = copy.length-1; i>indexShift; i--){
            copy[i] = copy[i-1];
        }
        copy[indexShift] = b;
        System.out.println("Array after copy marks array into copy array:" + Arrays.toString(copy));

        //Delete value with replace
        int delInd = 2;
        testArr[delInd] = 0;
        System.out.println("Array after delete with replace, test array:" + Arrays.toString(testArr));
        //Delete with left shift
        for (int i = delInd;i<testArr.length-1;i++){
            testArr[i] = testArr[i+1];
        }
        System.out.println("Array after delete with left shift, test array:" + Arrays.toString(testArr));

        //search
        int value1 = 88;
        int value2= 150;
        boolean found = false;
       for(int i = 0; i<marks.length; i++){
           if (marks[i] == value1){
               System.out.println("value1 found in index:" + i);
               found = true;
           }
       }
        if (!found){
            System.out.println("Value not found!!");
        }

        found = false;
        for(int i = 0; i<marks.length; i++){
            if (marks[i] == value2){
                System.out.println("value2 found in index:" + i);
                found = true;
            }
        }
        if (!found)
            System.out.println("Value not found!!");

    }
}
