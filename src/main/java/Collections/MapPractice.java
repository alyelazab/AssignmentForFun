package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map<Object, Object> map, Object value) {
        ArrayList<Object> result = new ArrayList<>();
        for(Map.Entry<Object, Object> entry : map.entrySet()){
            if(entry.getValue().equals(value)){
                result.add(entry.getKey());
            }
        }
        Object[] object = result.toArray();
        return object;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i<=size; i++){
            if(i==1){
                map.put(i,i);
            }
            if(i==2){
                map.put(i,i-1);
            }
            if(i>2){
                map.put(i, map.get(i-2) + map.get(i-1));
            }
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int x = size;
        for(int i = 1; i<=x; i++){
            if(i==1){
            map.put(i,first);
            }
            if(i==2){
                map.put(i,second);
            }
            if(i>2){
                map.put(i, map.get(i-2) + map.get(i-1));
            }
        }
        return map;
    }
}
