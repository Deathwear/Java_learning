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
        // Method invocation using Object creation 
        // Example2 obj = new Example2();
        //c = obj.logic(a,b);  
        // this wil execute when we don't provide static in method
        int a = 5;
        int b = 7;
        int c = logic(a, b);
        
        int a1 = 7;
        int b1 = 5;
        int c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
