public class CountDemo {

    static final int PASS_MARK = 50;

    public static void main(String[] args) {

        int mathsMarks = Integer.parseInt(args[0]);
        int scienceMarks = Integer.parseInt(args[1]);
        int socialMarks = Integer.parseInt(args[2]);
        int englishMarks = Integer.parseInt(args[3]);

        int passCount = 0;

        // Fill in the missing code here to count
        if (mathsMarks >= PASS_MARK) {
            passCount++;
        }

        if (scienceMarks >=PASS_MARK) {
            passCount++;
        }

        if (socialMarks >= PASS_MARK) {
            passCount++;
        }

        if (englishMarks >= PASS_MARK) {
            passCount++;
        }

        System.out.println("passCount = " + passCount);
    }
}