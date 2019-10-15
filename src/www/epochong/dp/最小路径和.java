package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/21 15:31
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 给定m x n网格填充非负数，找到从左上到右下的路径，这最小化了沿其路径的所有数字的总和。
 *
 * 注意：您只能在任何时间点向下或向右移动。
 */
public class 最小路径和 {
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid[0] == null) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int[][] arr = new int[row][col];
        arr[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 1; i < row; i++) {
            arr[i][0] = grid[i][0] + arr[i - 1][0];
        }
        for (int i = 1; i < col; i++) {
            arr[0][i] = grid[0][i] + arr[0][i - 1];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                arr[i][j] = grid[i][j] + Math.min(arr[i][j - 1] ,arr[i - 1][j]);
            }
        }
        return arr[row - 1][col - 1];
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0}};
        System.out.println(minPathSum(arr));
    }
}
