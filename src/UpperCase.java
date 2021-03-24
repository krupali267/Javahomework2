
public class UpperCase
{
    // to convert Uppercase to Lowercase and vice versa
    public void Case(){ // instance method

            String input1 = "LONDON";
            String input2= "america";

        System.out.println(input1.toLowerCase());
        System.out.println(input2.toUpperCase());
    }

    public static void main(String[] args) {
        UpperCase upperCase = new UpperCase(); // object created to call instance method
        upperCase.Case(); // calling instance method
    }

}
