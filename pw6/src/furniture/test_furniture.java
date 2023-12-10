package furniture;

public class test_furniture
{
    public static void main(String[] args)
    {
        table f = new table("wood", "dark", "Kvas");
        wardrobe w = new wardrobe("wood", "dark");
        System.out.println(f);
        System.out.println(w);
        furnitureShop f1 = new furnitureShop("table", "dark", "plastic");
        furnitureShop w1 = new furnitureShop("wardrobe", "light", "wood");
        f1.furniturePrice();
        w1.furniturePrice();
    }
}
