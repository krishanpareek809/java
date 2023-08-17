public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        // Solid Rectangle
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // Hollow Rectangle                      // *  *  *  *  *
        // // outer loop                            // *           *
        // for(int i=1; i<=4; i++){                 // *           *
        //     // inner loop                        // *  *  *  *  *
        //     for(int j=1; j<=5; j++){
        //         // cell -> (i,j)
        //         if(int i==1 || j==1 || i==4 || j==5){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Half Pyramid
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Inverted Half Pyramid
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        // // Inverted Half Pyramid(rotated by 180 degree)         //       *
        // // outer loop                                           //     * *
        // for(int i=1;i<=n;i++){                                  //   * * *
        //     // inner loop -> to print space                     // * * * *
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop -> to print star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Floyd's Triangle
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }


        // 0 1 triangle
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1" + " ");
        //         } else {
        //             System.out.print("0" + " ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Solid Rhombus
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();  
        }
    }
}