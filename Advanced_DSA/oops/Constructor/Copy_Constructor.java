package Advanced_DSA.oops.Constructor;

public class Copy_Constructor {
    int id;
    String name;
    int rollnumber;
    Copy_Constructor(int i, String n, int j)
    {
        this.id = i;
        this.name = n;
        this.rollnumber = j;
    }
    Copy_Constructor(Copy_Constructor s1)
    {
        this.id = s1.id;
        this.name = s1.name;
        this.rollnumber = s1.rollnumber;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+rollnumber);
    }
    public static void main(String arg[])
    {
        Copy_Constructor s1 = new Copy_Constructor(111,"Sonu",01);
        Copy_Constructor s2 = new Copy_Constructor(s1);
        s1.display();
        s2.display();
    }
    
}
