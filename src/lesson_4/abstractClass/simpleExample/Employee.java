package lesson_4.abstractClass.simpleExample;

public class Employee extends Human {

    /*
    Props:
    ------
     */
    private String _work;

    private int _age;

    private double tall;

    private color _eyesColor;


    /**
     * Constructor:
     * ------------
     *
     * @param _name String
     * @param _gender enum gender
     * @param _work String
     * @param _age int
     * @param tall double
     * @param _eyesColor enum color
     */
    public Employee(String _name, gender _gender, String _work, int _age, double tall, color _eyesColor) {
        super(_name, _gender);
        this._work = _work;
        this._age = _age;
        this.tall = tall;
        this._eyesColor = _eyesColor;
    }

    /*
    Override Methods from HumanClass
     */
    @Override
    public void getWork() {
        if (this._work.isEmpty()) System.out.println("you did not set any work for this human");
        else System.out.println("this human works as \"" + this._work + "\"");
    }

    @Override
    public void getAge() {
        if (this._age == 0) System.out.println("you did not set any age for this human");
        else System.out.println("this human's age is \"" + this._age + "\"");
    }

    @Override
    public void getTall() {
        if (this.tall == 0) System.out.println("you did not set any tall for this human");
        else System.out.println("this human's tall is \"" + this.tall + "\"");
    }

    @Override
    public void getEyesColor() {
        if (this._eyesColor == null) System.out.println("you did not set any eye color for this human");
        else System.out.println("this human's eye color is \"" + this._eyesColor + "\"");
    }
}
