import java.util.Iterator;
import java.util.Map;

public class SkipItemsByCondition {
    public interface Condition<K>{
        boolean check(K key);
    };

    public<K,V> Map<K,V> filter(Map<K,V> map,Condition<K> condition) {

        for (K key : map.keySet()) {
            if(condition == key){
                map.keySet().remove(key);
            }
        }
        return map;
    }
}
