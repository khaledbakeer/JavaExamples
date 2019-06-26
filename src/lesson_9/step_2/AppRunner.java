package lesson_9.step_2;

public class AppRunner {
    public static void main(String[] args) {
        System.out.println();
        /*
         * Build up a company hierarchy once
         */
        //Vertrieb
        HeadOfDepartment al1 = new HeadOfDepartment("W. Fischer", "Vertrieb", 001);
        al1.add(new NormalEmployee("P. Meier", 123));
        al1.add(new NormalEmployee("I. Schulz", 112));
        //Technologie
        HeadOfDepartment al2 = new HeadOfDepartment("T. Kunz", "Technologie", 002);
        al2.add(new NormalEmployee("M. Rehberg", 223));
        al2.add(new NormalEmployee("O. Riedel", 212));
        //Entwicklung
        HeadOfDepartment al3 = new HeadOfDepartment("M. Hardbrot", "Entwicklung", 003);
        al3.add(new NormalEmployee("M. Rehberg", 323));
        al3.add(al2);
        //Vorstand
        HeadOfDepartment XY = new HeadOfDepartment("A. Müller", "Vorstand", 004);
        XY.add(al1);
        XY.add(new NormalEmployee("U. Temann", 442));
        XY.add(al3);

        /*
         * Print company hierarchy
         */
        XY.print("");
    }
}
