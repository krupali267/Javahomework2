public class SwapNumbers
{
 //  two values when printed get interchanged
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("--Before Swap--");
        System.out.println("a"+ " = " + a);
        System.out.println("b" + " = " + b);

        a = a+b; // change the value of a to 30
        b = a-b; // change the value of b to 10
        a = a-b; // change the value of a again to 20

        System.out.println( "--After Swap--");
        System.out.println("a" + "=" + a);
        System.out.println("b" + "=" + b);
    }

}
