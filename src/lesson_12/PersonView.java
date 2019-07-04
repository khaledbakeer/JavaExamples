package lesson_12;

import java.util.List;

public class PersonView {

    private PersonController personController = new PersonController();

    public PersonView() {
        var x = personController.getPersonList();
        printList(x);
    }

    private void printList(List<IPerson> persons) {
        for (IPerson p : persons) {
            System.out.println(p.getName());
        }
    }
}
