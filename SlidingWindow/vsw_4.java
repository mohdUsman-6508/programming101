import java.util.HashMap;

public class vsw_4 {
    public static void main(String[] args) {
        String toys = "abaccab";
        int k = 2;
        int arr[] = maxToys(toys, k);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        String s = "";
        for (int i = arr[0]; i <= arr[1]; i++) {
            s += toys.charAt(i);
        }
        System.out.println(s);
        int[] ar={0,1,2,1};
        System.out.println(maxFruit(ar,2));
    }

    private static int[] maxToys(String toys, int type) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int i = 0;
        int j = 0;
        int max = 0;
        int ans[] = new int[3];

        while (j < toys.length()) {

            char toy = toys.charAt(j);
            hm.put(toy, hm.getOrDefault(toy, 0) + 1);
            if (hm.size() < type) j++;
            else if (hm.size() == type) {
                if (j - i + i > max) {
                    max = Math.max(max, j - i + 1);
                    ans[0] = i;
                    ans[1] = j;
                    ans[2] = max;
                }
                j++;
            } else if (hm.size() > type) {

                while (hm.size() > type) {
                    char ch = toys.charAt(i);
                    int val = hm.get(ch);
                    val--;
                    if (val == 0) {
                        hm.remove(ch);
                    } else {
                        hm.put(ch, val);
                    }

                    i++;
                }
                j++;
            }
        }
        return ans;
    }


        private static int maxFruit(int[] fruits,int type){
            HashMap<Integer,Integer> hm=new HashMap<>();
            int i=0;int j=0;int max=0;

            while(j<fruits.length){
                int fruit=fruits[j];
                hm.put(fruit,hm.getOrDefault(fruit,0)+1);

                if(hm.size()>2) j++;
                else if(hm.size()==2){
                    max=Math.max(max,j-i+1);
                    j++;
                }

                else if(hm.size()>2){
                    while(hm.size()>2){
                        int frt=fruits[i];
                        int val=hm.get(frt);
                        val--;
                        if(val==0) hm.remove(frt);
                        else hm.put(frt,val);
                        i++;
                    }
                    j++;
                }
            }

            return max;

        }
    }



