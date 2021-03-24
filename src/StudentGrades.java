
public class StudentGrades
{
    // students are assigned grades as per their percentage
    static String StudentName = "Krupali";
    static int RollNo = 1;
    static int Maths = 88;
    static double Science = 65;
    static int English = 78;
    static double Percentage = (Maths+Science+English) / 300 * 100; // calculation of percentage

    public static void main(String[] args)
    {
        System.out.println("Total Marks" + "=" + (Maths+Science+English));
        System.out.println("Percentage"+ " = " + (Percentage) + "%");

    if (Percentage >= 35){
        System.out.println(StudentName + " is " + " pass ");
    }
    else {
        System.out.println((StudentName + " is " + " fail "));
    }

    if (Percentage >= 80){
        System.out.println("Grade" + "A+");
    }
    else if (Percentage >= 60){
        System.out.println("Grade" + "A");
    }
    else if (Percentage >= 50){
        System.out.println("Grade" + "B");
    }
    else if (Percentage >= 35)
    {
        System.out.println("Grade" + "C");
    }
    else
    {
        System.out.println("Fail");
    }

    }

    }


