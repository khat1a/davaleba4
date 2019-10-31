import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
;

public class Test {
    public static void main(String[] args) {
        List<Integer> sia1 = new ArrayList<>();
        sia1.add(19);
        sia1.add(19);
        sia1.add(21);

        List<String> sia2 = new ArrayList<>();
        sia2.add("khatia");
        sia2.add("zuka");
        sia2.add("giorgi");

        HashMap<Integer, String> N3 = new HashMap<>();
        for (int i = 0; i < sia1.size(); i++) {
            N3.put(sia1.get(i), sia2.get(i));
        }

        for (int i = 1; i < N3.size()+1 ; i++) {
            System.out.println(N3.get(i));
        }

    }
}