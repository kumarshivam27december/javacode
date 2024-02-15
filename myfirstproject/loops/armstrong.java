public class armstrong {
    public static void main(String[] args) {
        int a = 135;    
        String s = Integer.toString(a);
        int n = s.length();
        int ans = 0;
        double l = n;

        int originalNumber = a;  // Store the original number for comparison

        while(a != 0) {
            double digit = a % 10;
            double power = Math.pow(digit, l);
            ans = (int) (ans + power);
            a /= 10;
        }

        if (ans == originalNumber) {
            System.out.println("arm");
        } else {
            System.out.println("not arm");
        }
    }
}
