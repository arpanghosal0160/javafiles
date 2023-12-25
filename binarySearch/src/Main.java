//sorted array binary search ascending order
public class Main{
    public static void main(String[] args) {
        int[] arr = {2,3,4,16,22,45};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index return -1 if it doesnot exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                //element is on left
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

/* if (target>arr[mid]){
        //element is on left
        end=mid-1;
        } else if (target<arr[mid]) {
        start=mid+1;
        }else {
        return mid;
        }*/
