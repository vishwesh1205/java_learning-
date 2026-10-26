public class working_with_types {
    public static void main(String[] args) {
        int a = 10;
        float b = 5.6f;
        double c = 5.6;
        char d = 'f';
        boolean e = true;
        byte f = 127;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        d++;
        System.out.println(d);
        int g = (int) f;
        System.out.println(g);
        int h = (int) b;
        System.out.println(h);
        int z = 10;
        int y = 10;
        boolean result = z > y || z == y;
        System.out.println(result);

    }
}
