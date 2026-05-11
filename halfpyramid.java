public class halfpyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++) {
            int stars = i;
            for(int j=1; j<=stars; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
