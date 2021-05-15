package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SumInArray
{
    public int findPairs(int arr[],int n)
    {
        //code here.
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++){

            if(pairs.containsKey(arr[i])) {
                System.out.println(arr[i] +", "+ pairs.get(arr[i]));
            } else
                pairs.put(n-arr[i], arr[i]);
        }
        if(pairs.isEmpty()){
            System.out.println(0);
            return 0;
        }
        return pairs.size();
    }

    public int  numberPairsForSum(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        int pair=0;
        for (int num : array) {
            if (set.contains(sum - num)) {
                String s = num + ", " + (sum - num) + " add up to " + sum;
                System.out.println(s);
                pair++;
            }
            set.add(num);
        }
        return pair;
    }
}
