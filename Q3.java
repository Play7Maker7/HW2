import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double X , Y;
        System.out.println("Enter Length and width: ");
        Scanner sin=new Scanner(System.in);
        X=sin.nextDouble();
        Y=sin.nextDouble();
        System.out.println("perimeter= "+(2*(X+Y)));
        System.out.println("Area= "+(X*Y));
    }
}
