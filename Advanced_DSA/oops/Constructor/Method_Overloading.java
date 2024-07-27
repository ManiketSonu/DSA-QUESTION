package Advanced_DSA.oops.Constructor;

public class Method_Overloading {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
class Test
{
    public static void main(String[] args) {
        System.out.println(Method_Overloading.add(11,11));
        System.out.println(Method_Overloading.add(11,11,11));
    }
}
