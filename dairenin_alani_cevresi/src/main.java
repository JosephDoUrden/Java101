import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, radius, area, circumference, angle, sectorArea;

        System.out.println("Enter the radius: ");
        radius = input.nextDouble();

        System.out.println("Enter the central angle: ");
        angle = input.nextDouble();

        area = pi*(radius*radius);
        circumference = 2*pi*radius;

        sectorArea = (pi*(radius*radius)*angle)/360;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle segment: " + sectorArea);

    }
}
