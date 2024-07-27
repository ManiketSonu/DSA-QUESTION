package Advanced_DSA.oops.Constructor;

public class Constructor_Ooverloading {
    int id;
    String name;
    int rollnumber;
    Constructor_Ooverloading(int i, String n)
    {
        this.id = i;
        this.name = n;
    }
    Constructor_Ooverloading(int i, String n, int j)
    {
        this.id = i;
        this.name = n;
        this.rollnumber = j;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+rollnumber);
    }
    public static void main(String arg[])
    {
        Constructor_Ooverloading s1 = new Constructor_Ooverloading(111,"amit");
        Constructor_Ooverloading s2 = new Constructor_Ooverloading(222,"amir",007);
        s1.display();
        s2.display();
    }
}
