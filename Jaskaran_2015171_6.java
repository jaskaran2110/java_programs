import java.util.Scanner;

public class Jaskaran_2015171_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Volume Cone_obj = new Cone();
        Volume Hemisphere_obj = new Hemisphere();
        Volume Cylinder_obj = new Cylinder();
        
        Cone_obj.volume();
        Hemisphere_obj.volume();
        Cylinder_obj.volume();
        
        input.close();
    }
}
interface Volume {
    void volume();
}

class Cylinder implements Volume {
    Scanner input = new Scanner(System.in);
    
    private void cylinderVolume(double height, double radius) {
        double area = (double)(3.14 * radius * radius * height);
        System.out.printf("Volume of cylinder : %.2f cubic units\n", area);
    }

    public void volume() {
        System.out.print("Enter height and radius : ");
        double height = input.nextDouble();
        double radius = input.nextDouble();
    
        cylinderVolume(height, radius);
    }
}

class Hemisphere implements Volume {
    Scanner input = new Scanner(System.in);

    private void hemisphereVolume(double radius) {
        double area = (double) (2.0/3.0 * 3.14 * radius * radius * radius);
        System.out.printf("Volume of cone : %.2f cubic units\n", area);
    }

    public void volume() {
        System.out.print("Enter radius : ");
        double radius = input.nextDouble();
        
        hemisphereVolume(radius);
    }
}

class Cone implements Volume {
    Scanner input = new Scanner(System.in);

    private void coneVolume(double height, double radius) {
        double area = (double)(1.0/3.0 * 3.14 * radius * radius * height);
        System.out.printf("Volume of cone : %.2f cubic units\n", area);
    }

    public void volume() {
        System.out.print("\nEnter height and radius : ");
        double height = input.nextDouble();
        double radius = input.nextDouble();

        coneVolume(height, radius);
    }
}
