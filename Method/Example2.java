package Method;


public class Example2 {

    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x+y) * 5;
        }
        return z;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);
        int a1 = 7;
        int b1 = 5;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
