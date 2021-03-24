import java.sql.SQLOutput;

public class VoteEligibility
{
    public void voteEligibility (int age){ // instance method with parameters

        if (age >= 18) {

            System.out.println("Eligible for Vote");
        }
        else
            System.out.println("Not Eligible for Vote");

    }

    public static void main(String[] args)
    {
        VoteEligibility voteeligibility = new VoteEligibility(); // object created to call instance method in main
        voteeligibility.voteEligibility(15); // calling instance method
    }




}
