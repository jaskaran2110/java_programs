/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-

Using the switch statement, write a menu-driven program to calculate the
maturity amount of a bank deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit
For option (i) accept Principal (p), rate of interest (r) and time period in years
(n). Calculate and outpute the maturity amount (a) receivable using the formula
a = p[1 + r / 100]n.
For option (ii) accept monthly installment (p), rate of interest (r) and time period
in months (n). Calculate and output the maturity amount (a) receivable using
the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12.
For an incorrect option, an appropriate error message should be displayed.
[ Use Scanner Class to take input ] */


import java.util.Scanner;
class menudriven
{
    public static void main(String[]args) {
        int p,n;
        float r;
        double a;
        int choice;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("\t\tMENU");
            System.out.println("(i)   Term Deposit");
            System.out.println("(ii)  Recurring Deposit");
            System.out.println("(iii) Exit");
            System.out.println("\n\t Enter Choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter principal amount");
                    p=sc.nextInt();
                    System.out.println("Enter rate of interest");
                    r=sc.nextFloat();
                    System.out.println("Enter time period in years");
                    n=sc.nextInt();
                    a=p*(1+r/100)*n;
                    System.out.println("Maturity amount received : "+ a);
                    break;


                case 2:
                    System.out.println("Enter principal amount");
                    p=sc.nextInt();
                    System.out.println("Enter rate of interest");
                    r=sc.nextFloat();
                    System.out.println("Enter time period in years");
                    n=sc.nextInt();
                    a=p*n+p*n*(n+1)/2*r/100*1/12;
                    System.out.println("Maturity amount received : "+ a);
                    break;


                case 3:
                    System.out.println("Exiting....");
                    break;


                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while(choice!=3);
    }
}