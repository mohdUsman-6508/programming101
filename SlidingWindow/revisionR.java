import java.util.HashMap;

public class revisionR {
    public static void main(String[] args) {
//        int[] a = {1, 2, -3, 4, 5, -2};
//        int k = 3;
//
//        int maxSumSubArr = max(a, k);
//        System.out.println(maxSumSubArr);

        int nums[] ={1,2,1,2,3};
        int k = 2;
        int z=subarraysWithKDistinct(nums, k);
        System.out.println(z);

    }

    public static int subarraysWithKDistinct(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0, j = 0;
        int ans = 0;

        while (j < nums.length) {

            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);

            if (hm.size() < k) j++;

            else if (hm.size() == k) {
                ans++;
                j++;
            } else if (hm.size() > k) {
                while (hm.size() > k && i < j) {
                    int val = hm.get(nums[i]);
                    val--;
                    if (val == 0) hm.remove(nums[i]);
                    else hm.put(nums[i], val);
                    i++;
                }
                if (hm.size() == k) ans++;
                j++;
            }

        }

        return ans;

    }

    private static int max(int[] a, int k) {
        int i = 0, j = 0;
        int sum = 0;

        while (j < a.length) {
            if (j < k) {
                sum += a[j];
            } else {
                sum = Math.max(sum, sum + a[j] - a[i]);
                i++;
            }
            j++;
        }

        return sum;
    }


}
