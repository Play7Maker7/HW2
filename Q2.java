import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double X , Y;
        System.out.println("Enter radius: ");
        Scanner sin=new Scanner(System.in);
        X=sin.nextDouble();
        Y=22.0/7;
        System.out.println("perimeter= "+(2*X*Y));
        System.out.println("Area= "+(Y*X*X));
    }
}
