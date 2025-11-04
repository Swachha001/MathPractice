import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Equation 1: Right Triangle Height ---
        System.out.println("Equation 1: Height of a Right Triangle");
        System.out.print("Base (b): ");
        double b = sc.nextDouble();
        System.out.print("Angle (degrees): ");
        double angle = sc.nextDouble();
        double height = b * Math.tan(Math.toRadians(angle));
        System.out.println("Height = " + height);

        // --- Equation 2: Compound Interest ---
        System.out.println("\nEquation 2: Compound Interest");
        System.out.print("Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Annual Rate (r in decimal): ");
        double r = sc.nextDouble();
        System.out.print("Compounds per Year (n): ");
        double n = sc.nextDouble();
        System.out.print("Time (years): ");
        double t = sc.nextDouble();
        double total = P * Math.pow(1 + r / n, n * t);
        System.out.println("Total Amount = " + total);

        // --- Equation 3: Cartesian to Polar ---
        System.out.println("\nEquation 3: Cartesian → Polar");
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        double rPolar = Math.hypot(x, y); // simpler than sqrt(x^2 + y^2)
        double thetaPolar = Math.toDegrees(Math.atan2(y, x)); // safer than atan(y/x)
        System.out.println("Radius = " + rPolar + ", Angle = " + thetaPolar + "°");

        // --- Equation 4: Distance Between Two Points ---
        System.out.println("\nEquation 4: Distance Between Two Points");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        double distance = Math.hypot(x2 - x1, y2 - y1);
        System.out.println("Distance = " + distance);

        // --- Equation 5: Quadratic Equation Roots ---
        System.out.println("\nEquation 5: Quadratic Equation");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double bq = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double D = Math.pow(bq, 2) - 4 * a * c;
        if (D < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-bq + Math.sqrt(D)) / (2 * a);
            double root2 = (-bq - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
            if (root1 >= 0 && root2 >= 0)
                System.out.println("Smallest Positive Root = " + Math.min(root1, root2));
            else if (root1 >= 0)
                System.out.println("Smallest Positive Root = " + root1);
            else if (root2 >= 0)
                System.out.println("Smallest Positive Root = " + root2);
            else
                System.out.println("No positive roots.");
        }

        sc.close();
    }
}