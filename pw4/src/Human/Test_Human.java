package Human;

public class Test_Human
{
    public static void main(String[] args) {
        Head head = new Head("Brown");
        Leg leftLeg = new Leg(30);
        Leg rightLeg = new Leg(31);
        Hand leftHand = new Hand(5);
        Hand rightHand = new Hand(5);

        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Цвет волос: " + person.getHead().getHairColor());
        System.out.println("Размер левой ноги: " + person.getLeftLeg().getSize());
        System.out.println("Размер правой ноги: " + person.getRightLeg().getSize());
        System.out.println("Количество пальцев на левой руке: " + person.getLeftHand().getFingers());
        System.out.println("Количество пальцев на правой руке: " + person.getRightHand().getFingers());
    }
}
