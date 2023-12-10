package furniture;

public class furnitureShop extends furniture
{
    protected int price = 0;
    protected String type;

    furnitureShop()
    {
        type = "table";
        color = "white";
        material = "plastic";
    }

    furnitureShop(String type, String color, String material)
    {
        this.type = type;
        this.color = color;
        this.material = material;
    }

    public void furniturePrice()
    {
        if (this.type == "table") price += 5000;
        else if (this.type == "wardrobe") price += 10000;

        if (this.material == "wood") price += 2000;
        else if (this.material == "plastic") price += 1000;
        else if (this.material == "metal") price += 2500;
        System.out.println(this.color + " " + this.material + " " + this.type + ": " + this.price + " rubles");
    }

    public String toString() {
        return this.color + " " + this.type;
    }
}
