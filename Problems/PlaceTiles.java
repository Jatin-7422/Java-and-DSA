package Problems;

class PlaceTiles {

    public static int CountTiles(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        // Vertically place
        int verticalPlacements = CountTiles(n - m, m);

        // Horizontally place
        int horizontalPlacements = CountTiles(n - 1, m);

        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String[] args) {
        int n = 1, m = 2;
        int totalways = CountTiles(n, m);
        System.out.println(totalways);
    }
}
