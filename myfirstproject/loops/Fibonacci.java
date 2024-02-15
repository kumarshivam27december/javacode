public class Fibonacci {
    public static void main(String[] args) {
        int input = 0;

        int previousTerm = 0;
        int currentTerm = 1;
        int nextTerm;
        
        System.out.println("Fibonacci Series less than " + input + ":");

        System.out.print(previousTerm + " " + currentTerm);

        do {
            nextTerm = previousTerm + currentTerm;
            if(nextTerm >= input) {
                break;
            }
            System.out.print(" " + nextTerm);
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        } while (nextTerm < input);
    }
}
