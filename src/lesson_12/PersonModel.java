package lesson_12;

public class PersonModel implements IPerson {

    private String name;

    private String tel;

    public PersonModel(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getTel() {
        return null;
    }

}
