import java.util.*;

public class L20240110 {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        List<Integer> nums1 = List.of(1, 1, 2, 3, 4, 4, 5, 6, 7, 7);
        for (Integer num : nums1) {
            if (num % 2 == 1) System.out.println(num);
        }

        //задание 2
        System.out.println("Задание 2");
        List<Integer> nums2 = List.of(1, 1, 2, 3, 4, 4, 5, 6, 7, 7);
        Set<Integer> set = new TreeSet<>(nums2);
        for (Integer i : set) {
            if (i % 2 == 0) System.out.println(i);
        }

        //задание 3
        System.out.println("Задание 3");
        var strs = List.of("foo", "bar", "baz", "foo", "bar");
        var set2 = new HashSet<>(strs);
        for (String s : set2) {
            System.out.println(s);
        }

        //задание 4
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            var num4 = map.get(word);
            if(num4==null){
                map.put(word,1);
            }else {
                map.put(word,num4+1);
            }
        }
        for (Map.Entry<String,Integer> pair:map.entrySet()){
            System.out.println(pair.getValue());
        }
    }
}
