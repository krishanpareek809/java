import java.util.Scanner;

import javax.lang.model.element.Element;

class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];       // 1-D Array
        // marks[0] = 1;
        // marks[1] = 10;
        // marks[2] = 45;
        // System.out.println(marks[2]);

        // Length of an array
        // System.out.println(marks.length);

        // Displaying an array using for loop
        // for(int i=0;i<marks.length;i++){
        // System.out.println(marks[i]);
        // }

        // for (int i=marks.length-1; i>=0; i--){
        // System.out.println(marks[i]);
        // }

        // Displaying an array using for-each loop
        // for(int element:marks){
        // System.out.println(element);
        // }

        // Multidimensional Arrays
        // int [][] flats = new int[2][3];      // 2-D Array
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        // for (int i=0; i<flats.length; i++) {
        //     for(int j=0; j<flats[i].length; j++){
        //         System.out.print(flats[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        // Practice problems on Arrays

        // float[] arr = {1.4f, 2.4f, 5.7f, 6.8f, 4.6f};
        // float sum = 0;
        // for (float element:arr){
        //     sum = sum + element;
        // }
        // System.out.println(sum);

        // int[] arr = {1,4,6,7,8};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // boolean isInArray = false;
        
        // for(int element: arr){
        //     if(n==element){
        //         isInArray = true;
        //         break;
        //     } 
        // }
        // if(isInArray){
        //     System.out.println(n+ " is present in the array");
        // } else{
        //     System.out.println(n+ " is not present in the array");
        // }

        // int [] marks = {89, 98, 87, 86, 96};
        // int sum = 0;
        // for(int element: marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks is: " + sum/marks.length);


        // Sum of two matrices
        // int[][] mat1 = {{1,2,3},
        //                 {1,2,3}};
        // int[][] mat2 = {{1,2,3},
        //                 {1,2,3}};
        // int[][] result = {{0,0,0},
        //                   {0,0,0}};
        
        // for(int i=0; i<mat1.length; i++){          // row number of times
        //     for(int j=0; j<mat1[i].length; j++){   // column number of times
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}