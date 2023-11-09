package String;

public class Comparision {
    public static void main(String[] args) {
        String a = "Aamir";
        String b = "Aamir";
        String c = a;
        System.out.println(c == a);  // this will represent true
        // ==
        System.out.println(a == b);  // this will also represent true bcz of pooling b is not creating another object it is working with previous Aamir.

        String name1 = new String("Aamir");
        String name2 = new String("Aamir");  // name2 is creating a new object. Therefore, name1 & name2 are pointing toward a different object.

        System.out.println(name1 == name2);  //it will give false bcz both variables are pointing towards a different object. therefore, they are not equal

        System.out.println(name1.equals(name2)); // it will give true  , it represent there value are equal therefore, it is showing true.

    }
}
