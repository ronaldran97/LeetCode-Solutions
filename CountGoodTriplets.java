/**

Runtime: 10 ms, faster than 97.19% of Java online submissions for Count Good Triplets.
Memory Usage: 37 MB, less than 97.19% of Java online submissions for Count Good Triplets.

**/


class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
    
        int count = 0;
        // for loop to go through the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length;j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                            count++;
                        }
                    }
                }
            }
        }
     return count;   
    }
}
