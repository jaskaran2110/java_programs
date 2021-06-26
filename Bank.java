/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-

Write a java program to create a class named 'Bank ' with the following data members:
 Name of depositor
 Address of depositor
 Account Number
 Balance in account
 
Class 'Bank' has a method for each of the following: 
1 - Generate a unique account number for each depositor
For first depositor, account number will be 1001, for second depositor it will be 1002 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor

After creating the class, do the following operations
1 - Enter the information (name, address, account number, balance) of the depositors. Number of depositors is to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final information of that depositor
4 - Remove some amount from the account of any depositor and then display final information of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts.*/




import java.util.*;

class banksystem
{
    Scanner sc=new Scanner(System.in);
    String name,Address,tempAdd;
    int balance,Acc_no;
   static int c=1001;

    banksystem()
    {

    } 


   void get(String name, String Address, int balance)
    {
        this.name=name;
        this.Address=Address;
        this.balance=balance;
    }

    void Acc_gen()
    {
        Acc_no=c;
        c++;
    }
    void Display()
    {
       
        System.out.println("Name of depositor:"+name);
        System.out.println("Address of depositor:"+Address);
        System.out.println("Balance of depositor:"+balance);
        System.out.println("Account number of depositor:"+Acc_no);
    }

    void deposit(int n)
    {
        balance+=n;
    }
    void withdraw(int n)
    {
        if(balance<n)
        {
            System.out.println("insufficient balance!!");
        }
        else
        {
            balance-=n;
        }
    }
    void changeAdd()
    {
        System.out.println("Previous Address :"+Address);
        System.out.println("Give new Address of depositor:");
        tempAdd=sc.nextLine();
        Address=tempAdd;
    }



}



public class Bank
{
    public static void main(String []args) 
    {
        String n,Add;
        int Bal;
        int money;
        Scanner s=new Scanner(System.in);
        banksystem obj=new banksystem();
 int itr;
 System.out.println("Enter Number of depositors:");
     itr=s.nextInt();
      
           for(int i=1;i<=itr;i++)
        {

            System.out.println("\t-----GIVE INFORMATION FOR "+i+" DEPOSITOR-----");

        System.out.println("Enter Name of depositor:");
        s.nextLine();
        n=s.nextLine();
        System.out.println("Enter Address of depositor:");
        Add=s.nextLine();
        System.out.println("Enter balance of depositor:");
        Bal=s.nextInt();
       obj.get(n,Add,Bal);
        obj.Acc_gen();
        System.out.println("\n\t\t-----------DETAILS OF "+i+ " DEPOSITOR----------");
        obj.Display();
        System.out.println("Enter Amount to deposit :");
        money=s.nextInt();
        obj.deposit(money);
        System.out.println("Enter Amount to withdraw:");
        money=s.nextInt();
        obj.withdraw(money);
        obj.changeAdd();
        System.out.println("\n\t\t-----------UPDATED DETAILS OF "+i+" DEPOSITOR----------");
        obj.Display();

          

        }
     
    }
}


// OUTPUT:-