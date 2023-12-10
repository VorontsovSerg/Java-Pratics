package dog;

public class test_dog
{
    public static void main(String[] args)
    {
        hound d = new hound("Борис", 6);
        System.out.println(d);
        d.hunt();
        System.out.println("In human age " + d.getHumanAge());

    }
}
