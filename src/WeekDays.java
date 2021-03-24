public class WeekDays
{
// to get name of the weekday when entered a number from 1 to 7
    public static void main(String[] args) {
// created variables and assigned values to them
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;

        int weekday = 3;

        if (weekday == a){

            System.out.println("First Day of Week is" + " " + "Monday");
        }
        else if (weekday == b){
            System.out.println("Second Day of Week is" + " " + "Tuesday");
        }
        else if (weekday == c){
            System.out.println("Third Day of Week is" + " " + "Wednesday");
        }
        else if (weekday == d){
            System.out.println("Fourth Day of Week is" + " " + "Thursday");
        }
        else if (weekday == e){
            System.out.println("Fifth Day of Week is" + " " + "Friday");
        }
        else if (weekday == f){
            System.out.println("Sixth Day of Week is" + " " + "Saturday");
        }
        else if (weekday == g){
            System.out.println("Seventh Day of Week is" + " " + "Sunday");
        }
        else
            System.out.println("Invalid");


    }

}
