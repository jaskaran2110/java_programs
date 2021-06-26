import java.util.Scanner;


public class Jaskaran_2015171_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----- Main Menu -----");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        int x = input.nextInt();
        
        if (x == 1) 
        {
                Temperature obj = new Fahrenheit();
                
                System.out.print("Enter temperature in Fahrenheit : ");
                double f_temp = input.nextDouble();
                
                obj.setTempData(f_temp);
                obj.changeTemp();
        }
        else if (x == 2) 
        {
                Temperature obj = new Celsius();
        
                System.out.print("Enter temperature in Celsius : ");
                double c_temp = input.nextDouble();
        
                obj.setTempData(c_temp);
                obj.changeTemp();
        }
        else
            System.out.print("Wrong choice");
        
        input.close();
    }    
}

abstract class Temperature {
    double temp;
    void setTempData(double t) {
        temp = t;
    }
    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double c_temp;
    void changeTemp(){
        c_temp = (double)((5.0 / 9.0) * (temp - 32));
        System.out.printf("\nTemperature in Celsius: %.2f", c_temp);
    }
}

class Celsius extends Temperature {
    double f_temp;
    void changeTemp() {
        f_temp = (double)((9.0 / 5.0) * temp) + 32;
        System.out.printf("\nTemperature in Celsius: %.2f", f_temp);
    }
}
