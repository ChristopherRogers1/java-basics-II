
public abstract class Vehicle {

    String brand;
    String color;
    int year;
    public Vehicle()
    {
        String brand="default";
        String color="default";
        int year = 2000;
    }

    public Vehicle(String brand, String color, int year)
    {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

}
