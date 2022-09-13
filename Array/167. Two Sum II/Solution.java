class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Left and right pinter
        int left = 0, right = numbers.length - 1;


        while (numbers[left] + numbers[right] != target) {

            if (numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        return new int[]{++left, ++right};
    }
}





//        Time Complexity = O(N)
//        Space Complexity = O(1)

//Input
//[2,7,11,15] [2,7,11,15]
//9
//Output
//[1,2]
//Expected
//[0,1]