package lesson_11;

import lesson_11.ThePattern.BellVerhalten;
import lesson_11.ThePattern.LaufVerhalten;

public abstract class Hund {

    public abstract void laufen();

    public abstract void bellen();

    public abstract void setLaufVerhalten(LaufVerhalten laufVerhalten);

    public abstract void setBellVerhalten(BellVerhalten bellVerhalten);
}
