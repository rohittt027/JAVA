public class NestedLoops {
    public static void main(String[] args) {

        for (int Line = 1; Line <= 4; Line++) {
            // one line
            for (int Star = 1; Star <= Line; Star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
