package guardenPattern;

public class GuardenTest {

    public static void main(String[] args) {
        Shape t = new Shape();
        testTriangle(t);
    }

    public static void testTriangle(Shape s) {
        switch (s) {
            case Triangle t -> System.out.println("Triangle");
            default -> System.out.println("Not a triangle");
        }
    }

    public static void checkType(Object s) {
        switch (s) {
            case Integer t -> System.out.println("it is ingtegr");
            case Double t -> System.out.println("it is double");
            case Float t -> System.out.println("it is float");
            default -> System.out.println("Not a Number");
        }
    }

}
