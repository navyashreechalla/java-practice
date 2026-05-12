public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,10};
        int k = 7;
        int ind = search(arr,k);
        System.out.println(ind);
    }
    static int search (int[] arr,int k){
        int mid, low=0, high=arr.length;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid] < k){
                low = mid+1;
            }else if(arr [mid]> k){
                high = mid-1;
            }
            
        }
        return -1;


    }
}
