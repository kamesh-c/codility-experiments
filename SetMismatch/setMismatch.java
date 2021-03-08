import java.util.Arrays;

public class setMismatch {
    public static int[] solutions(int[] nums){
       int[] missingValue = new int[2];
       int duplicate= -1, missing = 1;
       for(int i = 1; i < nums.length; i ++){
            //System.out.println(nums[i] + " - " + (i+1));
            if ( nums[i] == nums[i-1]){
                duplicate = nums[i];
            } else if ( nums[i] > nums[i-1]+ 1){
                missing = nums[i-1]+ 1;
            }
       }
       return new int[] {duplicate, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solutions(new int[]{1,2,3,4,5,5})));
        System.out.println(Arrays.toString(solutions(new int[]{2,2})));
        System.out.println(Arrays.toString(solutions(new int[]{1,1})));
        System.out.println(Arrays.toString(solutions(new int[]{1,2,2,4})));
    }
}
