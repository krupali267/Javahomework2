public class Salary
{
    // calculation of salary and other allowances
    public static void main(String[] args) {

        int EmployeeId = 01;
        String Name = "Mike";
        double BasicSalary = 2000.00;
        double HRA = BasicSalary * 10 / 100;
        double DA = BasicSalary * 8 / 100;
        double TA = BasicSalary * 9 / 100;
        double PF = BasicSalary * 20 / 100;


        System.out.println("Employee Id" + " - " + EmployeeId);
        System.out.println("Name" + " = " + Name);
        System.out.println("Basic Salary" + " = " + BasicSalary);
        System.out.println("HRA = 10% of Basic Salary" + " = " + HRA);
        System.out.println("DA = 8% of Basic Salary" + " = " + DA);
        System.out.println("TA = 9% of Basic Salary" + " = " + TA);
        System.out.println("PF = 20% of Basic Salary" + " = " + PF);
        System.out.println("Gross Salary" + " = " + (BasicSalary + HRA + TA + DA - PF));

        }

}



