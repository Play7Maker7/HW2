import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double X , Y , Z , A;
        System.out.println("Enter 3 numbers");
        Scanner sin = new Scanner(System.in);
        X=sin.nextDouble();
        Y=sin.nextDouble();
        Z=sin.nextDouble();
        A = (X+Y+Z)/3;
        System.out.println("The average = "+A);
    }
}
