public class ElementosProgramacion {
    public static void main(String[] args) {

        int a = 8, c = 4;
        double b = 10.00;

        // a)
        System.out.println("a) 3 + 4 - 5 = " + (3 + 4 - 5));

        // b)
        System.out.println("b) 8 + 5 * 9 - 6 = " + (8 + 5 * 9 - 6));

        // c) post-incremento
        System.out.println("c) a++ = " + a++);
        a = 8; // restaurar

        // d) pre-decremento
        System.out.println("d) --c = " + (--c));
        c = 4; // restaurar

        // e)
        System.out.println("e) 3*a+(-a-2)*2/3 = " + (3 * a + (-a - 2) * 2 / 3));

        // f)
        System.out.println("f) 3*a-(-a-2)*2/3 = " + (3 * a - (-a - 2) * 2 / 3));

        // g)
        System.out.println("g) a+b*((c-1)%2) = " + (a + b * ((c - 1) % 2)));

        // h)
        a /= c;
        System.out.println("h) a/=c → a = " + a);
    }
}
