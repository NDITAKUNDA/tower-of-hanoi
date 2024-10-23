public class Main {

    // Recursive function to solve the problem
    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: if there's only one disc, move it from source to destination
        if (n == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top n-1 discs from source to auxiliary using destination as buffer
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth disc from source to destination
        System.out.println("Move disc " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 discs from auxiliary to destination using source as buffer
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int numberOfDiscs = 5;

        // Calling the function
        solveTowerOfHanoi(numberOfDiscs, 'A', 'C', 'B');
    }
}