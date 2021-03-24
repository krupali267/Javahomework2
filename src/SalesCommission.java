public class SalesCommission
{

    public static void main(String[] args) {

        int salesId = 001; // instance variable
        String sellerName = "John";
        double salesAmn = 22000;
        double basicSal = 15000;

        // calculation of sales commission
        double a = salesAmn * 35 / 100;
        double b = salesAmn * 20 / 100;
        double c = salesAmn * 10 /100;
        double d = salesAmn * 5 /100;
        double e = salesAmn * 2 / 100;

        System.out.println("sales Id" + " = " +salesId);
        System.out.println("Seller Name" + " - " + sellerName);
        System.out.println("Basic Salary" + " = " + basicSal);
        System.out.println("Sales Amount" + " = " + salesAmn);

        if (salesAmn >= 50000){

            System.out.println("Sales Commission" + " = " + a);
        }
        else if (salesAmn >= 30000) {
            System.out.println("Sales Commission" + " = " + b);
        }

        else if (salesAmn >= 20000){

            System.out.println("Sales Commission" + " = "+ c);
        }

        else if (salesAmn >= 10000){

            System.out.println("Sales Commission" + " = "+ d);
        }

        else if (salesAmn < 10000){

            System.out.println("Sales Commission" + " = "+ e);
        }


    }
}




