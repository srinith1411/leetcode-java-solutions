class _LC832_TwoPointers_FlippingAnImage {

    // Approach: Two Pointers + Inversion
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int l = 0, r = image[i].length - 1;

            while (l < r) {

                int t = image[i][l];
                image[i][l] = image[i][r];
                image[i][r] = t;

                image[i][l] = image[i][l] == 0 ? 1 : 0;
                image[i][r] = image[i][r] == 0 ? 1 : 0;

                l++;
                r--;
            }

            if (l == r) {
                image[i][l] = image[i][l] == 0 ? 1 : 0;
            }
        }

        return image;
    }

    public static void main(String[] args) {

        // Example:
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(image);

        System.out.println("Result:");

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}