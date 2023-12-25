public class searchInrange {
    public static void main(String[] args) {
        int[] nums = {18, 12 , -7 ,3 , 4 , 5, 5};
        int target = 3;
        System.out.println(linearSearch(nums, target, 1, 5));

    }
    static int linearSearch(int[] nums, int target, int start, int end) {
        if (nums.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            //check for element at every index if it is = target
            int element = nums[index];
            if (element == target){
                return index;

            }
        }
        return -1; //if the element is not found
    }
}

