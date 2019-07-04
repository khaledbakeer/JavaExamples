package lesson_11.ThePattern.bellen;

import lesson_11.ThePattern.BellVerhalten;

public class LautBellen implements BellVerhalten {
    @Override
    public void bellen() {
        System.out.println("GANZ LAUT BELLEN!!");
    }
}
