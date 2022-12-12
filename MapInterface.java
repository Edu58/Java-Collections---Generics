import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    /*
    The Collections Framework also includes the java.util.Map , which is a collection of
    key/value pairs. Other names for map are “dictionary” or “associative array.” Maps
    store and retrieve elements with key values; they are very useful for things like caches
    or minimalist databases. When you store a value in a map, you associate a key object
    with a value. When you need to look up the value, the map retrieves it using the key.
     */

    public static void main(String[] args) {
        // This shows an implementation of a hash map
        Map<String, Date> dateMap = new HashMap<>();
        dateMap.put("today", new Date());
        System.out.println(dateMap);
    }
}
