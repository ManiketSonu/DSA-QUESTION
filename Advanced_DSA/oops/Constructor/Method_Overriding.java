package Advanced_DSA.oops.Constructor;

public class Method_Overriding {
    void display()
    {
        System.out.println("Method is running");
    }
}
class Bike extends Method_Overloading
{
    void display()
    {
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
        Bike s1 = new Bike();
        s1.display();
    }
}
