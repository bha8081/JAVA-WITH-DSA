//Place Tiles of size 1xm in a floor of size nxm.

public class Tiling {
    public static int placeTiles(int n, int m) {
        if(n<m) {
            return 1;
        } else if(n==m) {
            return 2;
        }
        return placeTiles(n-1,m) + placeTiles(n-m, m);
    }

    public static void main(String[] args) {
        int n=44, m=4;
        System.out.println(placeTiles(n,m));
    }
}
