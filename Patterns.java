public class Patterns {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 5;
        int number = 1;

        // Solid Rectangle
        // for(i=1; i<=4; i++){
        //     for(j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // Hollow Rectangle                      // *  *  *  *  *
        //     // outer loop                        // *           *
        // for(i=1; i<=4; i++){                     // *           *
        //     // inner loop                        // *  *  *  *  *
        //     for(j=1; j<=5; j++){
        //         // cell -> (i,j)
        //         if(i==1 || j==1 || i==4 || j==5){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Half Pyramid
        // for(i=1;i<=4;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Inverted Half Pyramid
        // for(i=4;i>=1;i--){
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        // // Inverted Half Pyramid(rotated by 180 degree)         //       *
        // // outer loop                                           //     * *
        // for(i=1;i<=n;i++){                                      //   * * *
        //     // inner loop -> to print space                     // * * * *
        //     for(j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop -> to print star
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(i=1;i<=n;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // for(i=1;i<=n;i++){                      // LEARN THE DRY FOR THIS CODE
        //     for(j=1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Floyd's Triangle
        
        // for(i=1;i<=n;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }


        // 0 1 triangle
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}