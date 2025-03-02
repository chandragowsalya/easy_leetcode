// 167. Two Sum II - Input Array Is Sorted

/* Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int value;
        int j =0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(numbers[0],1);
        for(int i =1;i<numbers.length;i++){
            value=target-numbers[i];
            if(mpp.containsKey(value)){
                res[j++]= mpp.get(value);
                res[j]=i+1;
            }
            else
             mpp.put(numbers[i],i+1);

        }
        return res;
    }
}
