public class lec2sth {
    public static void test(int x) {
        if(x > 5) {
            System.out.println(x + " is > 5");
        }
        else if(x == 5) {
            System.out.println(x + " equals 5");
        }
        else {
            System.out.println(x + " is < 5");
        }
    }
    public static void main(String[] arguments) {
        test(6);
        test(5);
        test(4);

        // Conversion by method
        // String five = 5;
        String five = Integer.toString(5);
        String five2 = "" + 5;
        System.out.println(five + " " + five2);

        int foo = Integer.parseInt("18");
        System.out.println(foo);

        double a = Math.cos(Math.PI / 2);
        double b = 0.0;
        System.out.println(a == b);
    }
}
