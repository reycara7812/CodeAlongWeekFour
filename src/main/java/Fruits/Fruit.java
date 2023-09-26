package Fruits;

public class Fruit {


    protected int calories;

    public Fruit() {
        this.calories = 0; // Default value
    }

    public void makeJuice() {
        System.out.println("Juice is made");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}