import java.util.HashSet;
import java.util.Iterator;

/**
 * Hashset allows null value
 * Hashset contains unique elements only
 * it stores the elements by using a mechanism called hashing
 * it's non synchronized
 * does not maintain the insertion order , elements are inserted on the basis of hashcode
 * hashset is best for search operations
 * load factor is 0.75 and initial capacity is 16
 *
 */


public class Hash {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("three");
        set.add("four");
        set.add("five");

        set.remove("One");
        set.removeAll(set);

        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
