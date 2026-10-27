public class HalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int Line = 1; Line <= n; Line++) {

            for (int number = 1; number <= Line; number++) {

                System.out.print(number);
            }
            System.out.println();
        }
    }

}
