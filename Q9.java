import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int X , Y , Z;
        System.out.println("Enter 2 integers: ");
        Scanner sin = new Scanner(System.in);
        X=sin.nextInt();
        Y=sin.nextInt();
        Z=X+Y;
        System.out.println("Sum = "+Z);
        Z=X-Y;
        System.out.println("Difference = "+Z);
        Z=X*Y;
        System.out.println("Product = "+Z);
        Z=(X+Y)/2;
        //I don't know how to make the (absolute value) equation
        System.out.println("Average = "+Z);
        if(X>Y) System.out.println("Maximum value = "+X);
        if(X<Y) System.out.println("Maximum value = "+Y);

    }
}
