package hashtable;

import java.util.*;
import java.util.HashMap;

public class LeftJoin {
    public static List<String[]> leftJoin(Map<String, String> synonyms, Map<String, String> antonyms) {
        List<String[]> result = new ArrayList<>();

        for (Map.Entry<String, String> entry : synonyms.entrySet()) {
            String key = entry.getKey();
            String synonymValue = entry.getValue();
            String antonymValue = antonyms.getOrDefault(key, null);

            result.add(new String[]{key, synonymValue, antonymValue});
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");
        synonyms.put("guide", "usher");
        synonyms.put("outfit", "garb");
        synonyms.put("wrath", "anger");

        Map<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");
        antonyms.put("fond", "averse");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");
        antonyms.put("wrath", "delight");

        List<String[]> result = leftJoin(synonyms, antonyms);

        for (String[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}