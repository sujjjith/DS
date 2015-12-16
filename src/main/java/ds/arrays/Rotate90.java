package ds.arrays;

/**
 * Created by skupunarapu on 12/15/2015.
 */
public class Rotate90 {
    public static void main(String[] args) {
        int[][] original = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        rotateBy90Right(original);
    }

    private static void rotateBy90Right(int[][] original) {
        print(original);
        System.out.println("-----------------------------");
        System.out.println("Transpose");
        int[][] transpos = transpose(original);
        print(transpos);
        System.out.println("-----------------------------");
        System.out.println("Swap Rows");
        int[][] rot90Right = swapRows(transpos);
        print(rot90Right);
        System.out.println("-----------------------------");
    }

    private static void print(int[][] original) {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static int[][] transpose(int[][] array) {
        if (array == null || array.length == 0)//empty or unset array, nothing do to here
            return array;

        int width = array.length;
        int height = array[0].length;

        int[][] array_new = new int[height][width];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                array_new[y][x] = array[x][y];
            }
        }
        return array_new;
    }

    private static int[][] swapRows(int[][] m) {
        for (int  i = 0, k = m.length - 1; i < k; ++i, --k) {
            int[] x = m[i];
            m[i] = m[k];
            m[k] = x;
        }
        return m;
    }

}
