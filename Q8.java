import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        double X , Y;
        System.out.println("Enter a number: ");
        X=sin.nextDouble();
        System.out.println("Square = "+(X*X));
        System.out.println("Cube = "+(X*X*X));
        Y= Math.pow(X,4);
        System.out.println("Forth power = "+Y);
    }
}
