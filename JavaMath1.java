public class JavaMath1 {
    public static void main(String[] args)

    {
        double a = 30;

        double b = Math.toRadians(a);
        System.out.println("Sine value of a is: " + Math.sin(a));

        System.out.println("Cosine value of a is: " + Math.cos(a));

        System.out.println("Tangent value of a is: " + Math.tan(a));

        // return the trigonometric arc sine of a
        System.out.println("Sine value of a is: " + Math.asin(a));

        // return the trigonometric arc cosine value of a
        System.out.println("Cosine value of a is: " + Math.acos(a));

        // return the trigonometric arc tangent value of a
        System.out.println("Tangent value of a is: " + Math.atan(a));

        // return the hyperbolic sine of a
        System.out.println("Sine value of a is: " + Math.sinh(a));

        // return the hyperbolic cosine value of a
        System.out.println("Cosine value of a is: " + Math.cosh(a));

        // return the hyperbolic tangent value of a
        System.out.println("Tangent value of a is: " + Math.tanh(a));
    }
}