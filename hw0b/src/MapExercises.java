import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
//        return null;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 97; i <=122; i++) {
            map.put((char)i, i-96);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {

//        return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, (int) Math.pow(i,2));
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        //return null;
        Map<String, Integer> map = new HashMap<>();
        int value;
        for (String i : words) {
            if( map.containsKey(i)){
                value = map.get(i);
                map.put(i,++value);
            }else{
                map.put(i,1);
            }
        }
        return  map;
    }
}
