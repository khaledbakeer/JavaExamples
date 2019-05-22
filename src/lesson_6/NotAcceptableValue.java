package lesson_6;

public class NotAcceptableValue extends Exception {
    public NotAcceptableValue(String message) {
        super(" 'NotAcceptableValue' Exception: " + message);
    }
}
