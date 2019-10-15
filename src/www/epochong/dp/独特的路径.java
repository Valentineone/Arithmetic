package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/21 14:57
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 机器人位于m x n 网格的左上角（在下图中标记为 “开始”）。
 *
 * 机器人只能在任何时间点向下或向右移动。机器人正试图到达网格的右下角（在下图中标记为 “完成”）。
 *
 * 有多少可能的独特路径？
 */
public class 独特的路径 {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];
    }
    public static void main(String[] args) {

    }
}
