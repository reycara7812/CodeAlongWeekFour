package Fruits;

import Fruits.Coco;
import Fruits.Fruit;

public class Shop {
    public static void main(String[] args) {
        Fruit mango = new Mango();
        Fruit coco = new Coco();

        mango.makeJuice(); // Calls Mango's makeJuice method
        coco.makeJuice();
    }
}