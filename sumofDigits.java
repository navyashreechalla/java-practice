public class sumofDigits {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int lastDigit;

        while(num>0) {
            lastDigit = num%10;
            sum += lastDigit;
            num = num / 10;
        }
        System.out.println("Sum is: " +sum);
    }

}
