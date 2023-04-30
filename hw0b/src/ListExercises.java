import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    /** sum: This method takes a list List<Integer> L and
     * returns the total sum of the elements in that list.
     * If the list is empty, it method should return 0.*/
	public static int sum(List<Integer> L) {
        if (L.size() == 0) {
            return 0;
        }else{
            int sum = 0;
            for (int i : L) {
                sum += i;
            }
            return sum;
        }
    }

    /** Returns a list containing the even numbers of the given list */
    /*
    * evens: This method takes a list List<Integer> L and
    * returns a new list containing the even numbers of the given list.
    * If there are no even elements, it should return an empty list.
    * */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> newList = new ArrayList<>();
        for (int i : L) {
            if (i % 2 == 0) {
                newList.add(i);
            }

        }
        return newList;
    }

    /** Returns a list containing the common item of the two given lists */
    /*
    * common: This method takes two lists List<Integer> L1, List<Integer> L2 and
    * returns a new list containing the common item of the two given lists.
    *  If there are no common items, it should return an empty list.
    * */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
//        return null;
        List<Integer> newList = new ArrayList<>();
        for (int i : L1) {
            if (L2.contains(i)){
                if (newList.contains(i)){
                    continue;
                }else{
                    newList.add(i);
                }
            }
        }
        return newList;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    /*
    * countOccurrencesOfC: This method takes a list and
    * a character List<String> words, char c and returns the number of occurrences of the given character in a list of strings.
    * If the character does not occur in any of the words, it should return 0.
    * */
    public static int countOccurrencesOfC(List<String> words, char c) {

//        return 0;
         int count = 0;
         for (String i : words) {
              if (i.indexOf(c) != -1) {
                  count++;
              }
         }
         return count;
    }
}
