public class MindRiddler {
    public static void main(String[] args) {
        int a = 19;
        int b = ++a;
        System.out.println("b " + b);
        System.out.println("a " + a);

        b = a++;
        System.out.println("b " + b);
        System.out.println("a " + a);

        String s = (b % 2 == 0) ? "Its even" : "its odd";
        System.out.println(s);

    }
}