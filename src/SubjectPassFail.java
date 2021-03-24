public class SubjectPassFail {

    //  if less then 35 marks in any one subject output is student is fail
    static String StudentName = "Krupali";
    static int RollNo = 1;
    static int Maths = 45;
    static double Science = 65;
    static int English = 25;

    public static void main(String[] args) {
        if (Maths >= 35 && Science >= 35 && English >= 35)
        {
            System.out.println(StudentName + " is " + " Pass ");
        }
        else
        {
            System.out.println(StudentName + " is " + "Fail");
        }

    }
}
