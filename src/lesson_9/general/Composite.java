package lesson_9.general;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> childComponents = new ArrayList<>();

    public void operation() {
        System.out.println("I am a Composite. I have the following children: ");
        for (Component childComps : childComponents) {
            childComps.operation();
        }
    }

    public void add(Component comp) {
        childComponents.add(comp);
    }

    public void remove(Component comp) {
        childComponents.remove(comp);
    }

    public Component getChild(int index) {
        return childComponents.get(index);
    }
}