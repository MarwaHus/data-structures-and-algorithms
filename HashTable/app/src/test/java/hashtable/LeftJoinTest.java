package hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin() {
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
        List<String[]> expected = new ArrayList<>();
        expected.add(new String[]{"diligent", "employed", "idle"});
        expected.add(new String[]{"fond", "enamored", "averse"});
        expected.add(new String[]{"guide", "usher", "follow"});
        expected.add(new String[]{"outfit", "garb", null});
        expected.add(new String[]{"wrath", "anger", "delight"});
        List<String[]> result = LeftJoin.leftJoin(synonyms, antonyms);
        assertEquals(expected.size(), result.size(), "Result size doesn't match expected size");
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i), "Values at index " + i + " don't match");
        }
    }
}