package Fruits;

class Mango extends Fruit {


    public Mango() {
        setCalories(60); // Mango's calories 60
    }

    public void removeSeeds() {
        System.out.println("Seeds are removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Mango juice is made");
    }

    public void prepareMangoJuice() {
        removeSeeds();
        makeJuice();
    }
}