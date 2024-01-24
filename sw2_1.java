import java.util.HashMap;

public class sw2_1 {
///hashmap Practice
    public static void main(String[] args) {

        HashMap<Integer, Integer> hmp = new HashMap<>();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] = 2;
            else arr[i] = i * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            if (hmp.containsKey(arr[i])) {
                int valCount = hmp.get(arr[i]);
                valCount++;
                hmp.put(arr[i], valCount);
            } else hmp.put(arr[i], 1);
        }
        System.out.println(hmp);
        HashMap<String, Integer> hmOddEven = new HashMap<>();
        int countE = 0;
        int countO = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                hmOddEven.put("Even", countE++);
            } else hmOddEven.put("Odd", countO++);
        }
        for (int val : arr) System.out.print(val + " ");
        System.out.println(hmOddEven);

        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) hmp.put(i, 1);
            else hmp.put(i, i * i);
        }
        hmp.forEach((key, value) -> {
            System.out.println(key + "-->" + value);
            if (value % 2 == 0) hmp.put(key, -value);
        });
        System.out.println(hmp);
    }
}
