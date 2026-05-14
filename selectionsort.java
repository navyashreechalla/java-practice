public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {20,12,10,15,2};
        sort(arr);
        for(Integer i:arr) {
            System.out.println(i);
        }
    }
    static void sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int minimumIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[minimumIndex]){
                    minimumIndex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
    }
}
