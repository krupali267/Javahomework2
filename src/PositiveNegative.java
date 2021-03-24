public class PositiveNegative
{

        // to find a number is positive or negative
    public static void Number (double number) // static method with parameters

    {

      if (number < 0.0)

          System.out.println(number + "is a Negative Number");

       else if (number > 0.0)

          System.out.println(number + " is a Positive Number");

       else

        System.out.println(number + " is Zero");

    }

    public static void main(String[] args) {

        Number(-24); //calling static method in main method

    }

}
