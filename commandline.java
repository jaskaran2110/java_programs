/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-
 Write a java program to take input as a command line argument. Your name,
course, universityrollno and semester. Display the information.
 Name:
 UniversityRollNo:
 Course:
 Semester: 
 */



public class commandline
{
    public static void main(String[]args) {
            System.out.println("Name:"+args[0]);
            System.out.println("University Roll no:"+args[1]);
            System.out.println("Course:"+args[2]);
            System.out.println("Semester:"+args[3]);        
    }
}