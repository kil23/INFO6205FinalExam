package neu.info6205.edu;

public class Pell {

    public Pell() {
    }

    public long get(int n) {

        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        long[] arr = new long[3];

        arr[1] = 1;

        if (n <= 1) return arr[n];

        for (int i = 2; i <= n; i++) {
            arr[i % 3] = 2 * arr[(i + 2) % 3] + arr[(i + 1) % 3];
        }

        return arr[n%3];

    }
}
