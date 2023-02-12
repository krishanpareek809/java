public class Patterns {
    public static void main(String[] args) {
        int i;
        int j;

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
        for(i=4;i>=1;i--){
            for(j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}