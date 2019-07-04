package lesson_11.ThePattern.laufen;

import lesson_11.ThePattern.LaufVerhalten;

public class KannNichtLaufen implements LaufVerhalten {
    @Override
    public void laufen() {
        System.out.println("Kann doch gar nicht laufen.");
    }
}
