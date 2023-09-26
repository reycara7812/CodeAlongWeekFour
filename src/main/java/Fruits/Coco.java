package Fruits;

public class Coco extends Fruit {


    public Coco() {
        setCalories(354);
    }

    public void peel() {
        System.out.println("Coconut is peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Coconut milk is made");
    }

    public void prepareCoconutMilk() {
        peel();
        makeJuice();
    }
}
