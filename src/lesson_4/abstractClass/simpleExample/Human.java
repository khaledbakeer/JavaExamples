package lesson_4.abstractClass.simpleExample;

public abstract class Human {

    /*
    Enums:
    ------
     */
    public enum color {red, blue, brown, green}

    public enum gender {Male, Female, Other}

    /*
    Props:
    ------
     */
    private String _name;

    private gender _gender;


    /**
     * Constructor:
     * ------------
     *
     * @param _name   String
     * @param _gender Enum
     */
    public Human(String _name, gender _gender) {
        this._name = _name;
        this._gender = _gender;
    }


    /*
     * abstract methods
     */
    public abstract void getWork();

    public abstract void getAge();

    public abstract void getTall();

    public abstract void getEyesColor();

    @Override
    public String toString() {
        return "Name: " + this._name + ", Gender: " + this._gender;
    }

    /**
     * @param newName String
     */
    public void changeName(String newName) {
        this._name = newName;
    }
}
