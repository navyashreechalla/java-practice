public class palindrome {
    public static void main(String[] args) {
        String str = "RACECAR";
        System.out.println(checkpalindrome(str));

    }
    public static boolean checkpalindrome(String str) {
        int n=str.length();
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;

            }
        }
        return true;
    }
}
