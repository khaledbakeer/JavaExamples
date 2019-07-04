package lesson_11.ThePattern.bellen;

import lesson_11.ThePattern.BellVerhalten;

public class ElektronischBellen implements BellVerhalten {
    @Override
    public void bellen() {
        System.out.println("Elekkkkktronisch Bellen!");
    }
}
