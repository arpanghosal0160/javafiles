public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45 , 1 , 32 ,19};
        int target = 19;
        int ans= linearSearch(nums, target);
        System.out.println(ans);


    }
    //search in the array: return th index if item found else return -1
    static int linearSearch(int[] nums, int target) {
        if (nums.length == 0){
            return -1;
        }
        for (int index = 0; index < nums.length; index++) {
            //check for element at every index if it is = target
            int element = nums[index];
            if (element == target){
                return index;

            }
        }
        return -1; //if the element is not found
    }
}
