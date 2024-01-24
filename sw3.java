public class sw3 {
    public static void main(String[] args) {
        int num[] = {3,2,5,4,-7,3,10};
        int k = 3;
        int[] arr = new int[num.length - k + 1];

        int i = 0;
        int j = 0;
        int max = num[0];

        while (j < num.length) {
            max = Math.max(max, num[j]);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                arr[i] = max;
                if(num[i]==max ) max=num[i+1];
                i++;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
