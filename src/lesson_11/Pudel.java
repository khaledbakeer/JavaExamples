package lesson_11;

import lesson_11.ThePattern.BellVerhalten;
import lesson_11.ThePattern.LaufVerhalten;
import lesson_11.ThePattern.bellen.LautBellen;
import lesson_11.ThePattern.laufen.KannNichtLaufen;

public class Pudel extends Hund {
    private BellVerhalten bellVerhalten = new LautBellen();
    private LaufVerhalten laufVerhalten = new KannNichtLaufen();

    @Override
    public void laufen() {
        laufVerhalten.laufen();
    }

    public void bellen() {
        bellVerhalten.bellen();
    }

    @Override
    public void setLaufVerhalten(LaufVerhalten laufVerhalten) {
        this.laufVerhalten = laufVerhalten;
    }

    @Override
    public void setBellVerhalten(BellVerhalten bellVerhalten) {
        this.bellVerhalten = bellVerhalten;
    }
}
