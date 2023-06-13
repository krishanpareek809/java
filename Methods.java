public class Methods {

    // static int fun(int a, int b){
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     System.out.println(fun(2,3));
    // }
    

    // VarArgs ( Varibale Arguments )

    static int sum(int x, int ...arr){
        int result = x;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,3,5,6));
    }
}