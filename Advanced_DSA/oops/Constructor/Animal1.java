package Advanced_DSA.oops.Constructor;

public class Animal1 {
    int numsleg;
    String name;
    String sound;
    Animal1()
    {
        numsleg = 4;
        name = "";
    }
    Animal1(String sound)
    {
        numsleg = 4;
        this.sound = "";
    }
}
class Dog extends Animal1
{
    String breed;
    String color;
    Dog()
    {
        super("bark");
        breed = "";
        color = "white";
    }
}
class Pitbull extends Dog
{
    boolean isbite = false;
    public static void main(String[] args) {
        Pitbull P = new Pitbull();
        System.out.println(P.numsleg);
        System.out.println(P.name);
        System.out.println(P.sound);
        System.out.println(P.breed);
        System.out.println(P.color);
        System.out.println(P.isbite);
    }
}
