package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/21 15:13
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 跟进 “独特路径”：
 *
 * 现在考虑是否在网格中添加了一些障碍。有多少独特的路径？
 *
 * 障碍物和空白空间在网格中分别标记为 1 和 0。
 *
 * 例如，
 *
 * 如下图所示，3x3 网格中间有一个障碍物。
 *
 * [
 *   [0,0,0]，
 *   [0,1,0]，
 *   [0,0,0]
 * ]
 * 唯一路径的总数是 2。
 *
 * 注意： m和n最多为 100。
 */
public class 独特的路径ii {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length < 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            } else {
                arr[0][i] = 1;
            }
        }
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            } else {
                arr[i][0] = 1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr[row - 1][col - 1];
    }

    public static void main(String[] args) {

    }






}
