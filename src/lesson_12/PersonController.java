package lesson_12;

import java.util.ArrayList;
import java.util.List;

public class PersonController {

    private List<IPerson> persons = new ArrayList<>();

    public PersonController() {
        addPerson(new PersonModel("person 1", "001"));
        addPerson(new PersonModel("person 2", "002"));
        addPerson(new PersonModel("person 3", "003"));
        addPerson(new PersonModel("person 4", "004"));
        addPerson(new PersonModel("person 5", "005"));
        addPerson(new PersonModel("person 6", "006"));
    }

    private void addPerson(IPerson p) {
        persons.add(p);
    }

    private void removePerson(IPerson p) {
        persons.remove(p);
    }

    public List<IPerson> getPersonList() {
        return persons;
    }

}
