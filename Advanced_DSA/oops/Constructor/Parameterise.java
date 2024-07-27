package Advanced_DSA.oops.Constructor;

public class Parameterise {
    int id;
    String name;
    Parameterise(int i, String n)
    {
        this.name = n;
        this.id = i;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String arg[])
    {
        Parameterise s1 = new Parameterise(111,"Amit");
        Parameterise s2 = new Parameterise(222, "Amir");
        s1.display();
        s2.display();
    }
}
