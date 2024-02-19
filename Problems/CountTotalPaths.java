package Problems;

class CountTotalPaths {

    public static int Countpath(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int movedownwards = Countpath(i + 1, j, n, m);

        // move Right
        int moveright = Countpath(i, j + 1, n, m);

        return movedownwards + moveright;
    }

    public static void main(String[] args) {
        int n= 3, m=3;
        int totalpaths = Countpath(0, 0, n, m);
        System.out.println(totalpaths);
    }

}
