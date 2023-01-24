package CardinalBinary;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CardinalBinary {
    public void solution(){
        Integer[] arr={1,2,3,4};
        Map<Integer, Integer> tempMap=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            tempMap.put(arr[i],Integer.bitCount(arr[i]));
        }
        LinkedHashMap<Integer, Integer> sortedMap = tempMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        Integer[] output= sortedMap.keySet().toArray(new Integer[0]);
        for(Integer num:output)
            System.out.println(num);
    }
}
