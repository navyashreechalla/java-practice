public class invertedstar {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++) {
            //System.out.println(" * ");
            //spaces
            int spaces = i-1;
            for(int k=1;k<=spaces;k++) {
                System.out.print(" ");
            }
            //stars
            int stars = n-i+1;
            for(int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
