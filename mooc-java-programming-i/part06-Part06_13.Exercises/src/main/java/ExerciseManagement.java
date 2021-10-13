
public class ExerciseManagement {
    public static void main(String args[]){
        int[] nums = {3, 3};

        System.out.println(twoSum(nums, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] numsToSum = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] + nums[i] == target && nums[j] != nums[i]){
                    numsToSum[0] = i;
                    numsToSum[1] = j;
                }
            }
        }
        
        return numsToSum;
    }
}
