package dish;

public class test_dish
{
    public static void main(String[] args) {
        plate plate = new plate(4);
        System.out.println(plate);
        plate.setContained("Обед");
        System.out.println(plate + "\n");

        teapot teapot = new teapot("grey", "metal", "tea");
        System.out.println(teapot + "\n");
        teapot.pour();
        System.out.println(teapot + "\n");
        teapot.pour_out();
        System.out.println(teapot);
    }
}
