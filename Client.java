import java.rmi.*;
import java.util.*;
public class Client {
    public static void main(String[] args) throws Exception
    {
        //get which type of calculator the user wants
        Scanner sc = new Scanner(System.in);
        while (true) {
            // User Menu
            System.out.println(
                "\n1.regular calculator\n2.Banking Calculator\n3 or more).Exit");
            System.out.println("Enter the option:");
            int opt = sc.nextInt();
            if (opt == 1) {
                regCalc();
            }
            else if(opt==2){
                BankingCalc();
            }
            else{
                break;
            }
           
        }
    }
    //regular calculating operations
    public static void regCalc()throws Exception{
        Scanner sc = new Scanner(System.in);

        while (true) {
            // User Menu for regular calculation operations
            System.out.println(
                "\n1.Addition\n2.Subtraction\n3.multiplication\n4.division\n5.Exit");
            System.out.println("Enter the option:");
            int opt = sc.nextInt();
            CalcInterface obj=(CalcInterface)Naming.lookup("ADD");
            if (opt == 5) {
                break;
            }
            //get two numbers for the simple operations
            System.out.println(
                "Enter the the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();
            int n;
            //switch for going through all the simple operations and running the users chosen operation
            switch (opt) {
            case 1:
                // lookup method to find reference of remote
                // object
                n = obj.add(a, b);
                System.out.println("Addition= " + n);
                break;
            case 2:
                n = obj.subtract(a, b);
                System.out.println("Subtraction= " + n);
                break;
            case 3:
                n = obj.multiply(a, b);
                System.out.println("Multiplication = " + n);
                break;
            case 4:
                n = obj.divide(a, b);
                System.out.println("Division = " + n);
                break;
            }
        }
    }
    public static void BankingCalc()throws Exception{
        Scanner sc = new Scanner(System.in);
        while (true) {
            // User Menu for complex banking formulas
            System.out.println(
                "\n1.simple interest\n2.compound interest\n3.loan EMI\n4.effective annual rate\n5.Exit");
            System.out.println("Enter the option:");
            int opt = sc.nextInt();
            if (opt == 5) {//break method
                break;
            }
            //calculation variables for the methods
            int P,R,N,T;
            //variables for getting the return values
            int n;
            double m;
            //using the interface to access implementation methods
            CalcInterface obj=(CalcInterface)Naming.lookup("ADD");
            //switch for going thru users choice of calc
            switch (opt) {
            case 1:
                // lookup method to find reference of remote
                // object
                System.out.println(
                "Enter the the first number:");
                P = sc.nextInt();
                System.out.println("Enter the second number:");
                R = sc.nextInt();
                System.out.println("Enter the third number:");
                N = sc.nextInt();
                n = obj.simpleInterest(P,R,N);
                System.out.println("simple interest= " + n);
                break;
            case 2:
            System.out.println(
                "Enter the the first number:");
                P = sc.nextInt();
                System.out.println("Enter the second number:");
                R = sc.nextInt();
                System.out.println("Enter the third number:");
                T = sc.nextInt();
                n = obj.compoundInterest(P,R,T);
                System.out.println("compount interest= " + n);
                break;
            case 3:
                System.out.println(
                "Enter the the first number:");
                P = sc.nextInt();
                System.out.println("Enter the second number:");
                R = sc.nextInt();
                System.out.println("Enter the third number:");
                N = sc.nextInt();
                n = obj.loanEMI(P,R,N);
                System.out.println("loan emi= " + n);
                break;
            case 4:
                System.out.println(
                "Enter the the first number:");
                R = sc.nextInt();
                System.out.println("Enter the second number:");
                N = sc.nextInt();
                m = obj.effecAnnualRate(R, N);
                System.out.println("effective annual rate= " + m);
                break;
            }
    }
}
}
