public class Symbol {
 // to do arithmetic calculation between two numbers when user enters their symbols
    static double a = 25;  // static variables and assigned the values
    static double b = 20;
    static char symbol = '+';

    public static void main(String[] args) {
        if (symbol == '+') {

            System.out.println("Addition of"+ " " + a + " & " + b + " = " + (a + b));
        } else if (symbol == '-') {

            System.out.println("Subtraction of" + " " + a +" & " + b + "="  + (a - b));
        } else if (symbol == '/') {

            System.out.println("Division of" + " "+ a +" & " + b + "=" + (a / b));
        } else if (symbol == '*') {

            System.out.println("Division of" + " "+ a +" & " + b + "=" + (a * b));
        } else {
            System.out.println("invalid");
        }

    }
}