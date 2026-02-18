public class OopsBannerUC5 {
    public static void main(String[] args) {
        
        // UC5: Inline Array Initialization with String.join()
        String[] bannerLines = {
            String.join("  ", " **** ", " **** ", " **** ", " **** "), // Row 1
            String.join("  ", "* *", "* *", "* *", "* *"), // Row 2
            String.join("  ", "* *", "* *", "* *", "* "), // Row 3
            String.join("  ", "* *", "* *", " **** ", " **** "), // Row 4
            String.join("  ", "* *", "* *", "* ", "    *"), // Row 5
            String.join("  ", "* *", "* *", "* ", "    *"), // Row 6
            String.join("  ", " **** ", " **** ", "* ", " **** ")  // Row 7
        };

        // UC5: Using Enhanced For Loop (for-each) for cleaner output
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}