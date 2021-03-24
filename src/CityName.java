
public class CityName {
    // program to get output of city name while inputting of an alphabet
    public static void main(String[] args) {
        String a = "Ahemdabad";
        String b = "Baroda";
        String c = "Chandigarh";
        String d = "Delhi";
        String e = "Egypt";
        String f = "France";

        String CityName = c;

        if (CityName == a) {

            System.out.println("City Name starting with" + " A " + "-" + a);
        } else if (CityName == b) {

            System.out.println("City Name starting with" + " B " + " - " + b);
        } else if (CityName == c) {

            System.out.println("City Name starting with" + " C " + " -" + c);
        } else if (CityName == d) {

            System.out.println("City Name starting with" + "D " + "-" + d);
        } else if (CityName == e) {

            System.out.println("City Name starting with" + " E " + "-" + e);
        }
        else if (CityName == f){

            System.out.println("City Name starting with" + " F " + "-" + f);
        }

        else {

            System.out.println("Invalid City Name");

        }
    }

}
