public class CharacterPattern {
    public static void main(String[] args) {

        int n = 4;
        char ch = 'A';

        // outer loop
        for (int Line = 1; Line <= n; Line++) {
            
            // inner loop
            for (int chars = 1; chars <= Line; chars++) {

                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }

    }

}
