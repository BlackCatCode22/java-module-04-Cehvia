import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> animals = new HashMap<>();

        animals.put("Bunny", 12345);
        animals.put("Bear", 54321);
        animals.put("Pig", 8675309);

        System.out.println(animals);

        System.out.println(animals.get("Pig"));

        System.out.println(animals.remove("Bear"));

        System.out.println(animals.containsKey("Bunny"));

        System.out.println(animals.containsValue(8675309));

        System.out.println(animals.size());
        //Size is 2 because "Bear" was removed

    }
}