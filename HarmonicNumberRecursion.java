class HarmonicNumberRecursion {
    public static void main(String[] args) {
        // Example: Calculate the harmonic number for n = 5
        int n = 5;
        double harmonicNumber = calculateHarmonicNumber(n);

        System.out.println("Harmonic number for n = " + n + " is: " + harmonicNumber);
    }

    // Recursive method to calculate the harmonic number
    static double calculateHarmonicNumber(int n) {
        // Base case: harmonic number for n = 1 is 1.0
        if (n == 1) {
            return 1.0;
        } else {
            // Recursive case: Hn = 1/n + H(n-1)
            return 1.0 / n + calculateHarmonicNumber(n - 1);
        }
    }
}
