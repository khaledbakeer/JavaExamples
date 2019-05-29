package lesson_7;

import java.util.*;

public class Collections {

    static List tmp = Arrays.asList("a b c d e f g h i g k l m n o p q r s t u v w x y z".split(" "));

    public static void main(String[] args) {
        // Sets: unordered elements
        Set<String> set = new HashSet<>(tmp);
        for (String x : set) {
            System.out.print(x + ", ");
        }
        System.out.println();

        // Lists: ordered elements with index.
        // ArrayList
        ArrayList<String> list = new ArrayList<>(tmp);
        String k = list.get(10);
        System.out.println(k);


        // LinkedList
        LinkedList<String> lList = new LinkedList<>(tmp);
        System.out.println();
        System.out.println("First element is: " + lList.getFirst());
        System.out.println("Last element is: " + lList.getLast());
        lList.addFirst("new first element");
        System.out.println(lList);

        // Iterator:
        Iterator<String> itr = lList.iterator();
        while (itr.hasNext()) {
            System.out.println("get element:  " + itr.next() + "  using Iterator");
        }

        /*
        Maps:
        -----
        Properties:
            * A map contains pairs of key and value.
            * Each key refers to a value.
            * Two keys can refer to the same value.
            * There are not two equal keys in one map.
         */
        Map<String, Map<String, Double>> StudentenNoten = new HashMap<>();

        Map<String, Double> MaxNoten = new HashMap<>();
        MaxNoten.put("MathI", 1.3);
        MaxNoten.put("MathII", 1.7);
        MaxNoten.put("TGI", 4.0);
        MaxNoten.put("SWT", 2.0);

        Map<String, Double> MikiNoten = new HashMap<>();
        MikiNoten.put("MathI", 3.3);
        MikiNoten.put("MathII", 2.2);
        MikiNoten.put("TGI", 1.6);
        MikiNoten.put("SWT", 2.0);

        Map<String, Double> SpongebobNoten = new HashMap<>();
        SpongebobNoten.put("MathI", 2.3);
        SpongebobNoten.put("MathII", 1.2);
        SpongebobNoten.put("TGI", 4.6);
        SpongebobNoten.put("SWT", 3.0);


        StudentenNoten.put("Max", MaxNoten);
        StudentenNoten.put("Miki", MikiNoten);
        StudentenNoten.put("Spongebob", SpongebobNoten);

        System.out.println(StudentenNoten);

        // another way to print map keys, values using foreach loop:
        for (Map.Entry<String, Map<String, Double>> all : StudentenNoten.entrySet()) {
            double sume = 0;
            int count = 0;
            System.out.println("Student Name: " + all.getKey());
            for (Map.Entry<String, Double> x : all.getValue().entrySet()) {
                sume = sume + x.getValue();
                count = count + 1;
                System.out.println("\t " + x.getKey() + ": " + x.getValue());
            }
            System.out.println("Average: " + (sume / count));

        }

    }
}
