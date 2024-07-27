package Advanced_DSA.oops.Constructor;

public class Inhertience {
    float salary = 10000;
}
class Programmer extends Inhertience{
    int bonus = 800;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
    }
}
