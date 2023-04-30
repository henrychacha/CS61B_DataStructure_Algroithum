import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello world!");

        // TreeMap
        Map<String, String> L = new TreeMap<>();
        L.put("dog", "woof");
        L.put("cat", "meow");
        String sound = L.get("cat");
        System.out.println(sound);

        // HashMap
        Map<String, String> map = new HashMap<>();
        map.put("hello", "hi");
        map.put("hello", "goodbye");
        System.out.println(map.get("hello"));
        System.out.println(map.size());
        if (map.containsKey("hello")) {
            System.out.println("\"hello\" in map");
        }
        for (String key : map.keySet()) {
            System.out.println(key);
        }

    }
}