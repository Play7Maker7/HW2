public class Q6 {
    public static void main(String[] args) {
        int Z;
        String A , B;
        String X="Hello ";
        String Y="World!";
        Z=X.length()+Y.length();
        System.out.println("length = "+Z);
        A=X.substring(1, 2);
        System.out.println("sub str A = "+A);
        B=X.substring(X.length()/2,X.length());
        System.out.println("sub str B = "+B);
        System.out.println("str1 + str2 = "+(X+Y));
        System.out.println("str2 + str1 = "+(Y+X));
    }
}
