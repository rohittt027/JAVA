public class InvertedStarPattern {
    public static void main(String[] args) {

        int n = 7;

        for (int Line = 1; Line <= n; Line++) {

            for (int Star = 1; Star <= n - Line + 1; Star++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }

}
