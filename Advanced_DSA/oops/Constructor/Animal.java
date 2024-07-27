package Advanced_DSA.oops.Constructor;

public class Animal {
    int numlegs;
    String sound;
    Animal()
    {
        numlegs = 4;
        sound = "sound";
    }
    Animal(String sound)
    {
        numlegs = 4;
        this.sound = "sound";
    }
}
class Dog extends Animal
{
    String breed;
    String color;
}
class Pitbull extends Dog
{
    boolean isbite = false;
    public static void main(String[] args) {
        Pitbull p = new Pitbull();
        System.out.println(p.numlegs);
        System.out.println(p.sound);
        System.out.println(p.breed);
        System.out.println(p.color);
        System.out.println(p.isbite);
    }
}
