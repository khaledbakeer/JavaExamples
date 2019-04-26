package lesson_2;

public class If_Switch {
    public static void main(String[] args) {

        int zahl = 2;

        // If statement:
        if (zahl == 1) {
            System.out.println("Fall 1");
        } else if (zahl == 2) {
            System.out.println("Fall 2");
        } else if (zahl == 3) {
            System.out.println("Fall 3");
        } else {
            System.out.println("Sonstiger Fall");
        }


        // the same with switch:
        switch (zahl) {
            case 1:
                System.out.println("Fall 1");
                break;
            case 2:
                System.out.println("Fall 2");
                break;
            case 3:
                System.out.println("Fall 3");
                break;
            default:
                System.out.println("Sonstiger Fall");
        }



    }
}
