public class largestnumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,4,7,8,9,10,2,13,4,5};
        int maxi = Integer.MIN_VALUE;
        for( int i=0; i<arr.length; i++){
            int curr = arr[i];
            if(curr>maxi){
                maxi = curr;
            }
        }
        System.out.println(maxi);

    }
}
