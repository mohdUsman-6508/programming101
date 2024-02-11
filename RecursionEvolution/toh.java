public class toh {
    public long toh(int N, int from, int to, int aux) {
        return solve(N, from, to, aux);
    }

    private long solve(int N, int from, int to, int aux) {
        long count = 0; // Initialize count here

        // Base case
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return 1; // Return 1 move for the single disk
        }

        // Move N-1 disks from 'from' to 'aux' using 'to' as auxiliary
        count += solve(N - 1, from, aux, to);

        // Move the largest disk from 'from' to 'to'
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        count++;

        // Move the N-1 disks from 'aux' to 'to' using 'from' as auxiliary
        count += solve(N - 1, aux, to, from);

        return count;
    }

}


