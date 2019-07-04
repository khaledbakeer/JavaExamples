package lesson_11;

import lesson_11.ThePattern.BellVerhalten;
import lesson_11.ThePattern.LaufVerhalten;
import lesson_11.ThePattern.bellen.LeiseBellen;
import lesson_11.ThePattern.laufen.SchnellLaufen;

public class Husky extends Hund {
    private BellVerhalten bellVerhalten = new LeiseBellen();
    private LaufVerhalten laufVerhalten = new SchnellLaufen();

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
