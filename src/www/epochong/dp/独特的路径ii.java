package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/21 15:13
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * ���� ������·������
 *
 * ���ڿ����Ƿ��������������һЩ�ϰ����ж��ٶ��ص�·����
 *
 * �ϰ���Ϳհ׿ռ��������зֱ���Ϊ 1 �� 0��
 *
 * ���磬
 *
 * ����ͼ��ʾ��3x3 �����м���һ���ϰ��
 *
 * [
 *   [0,0,0]��
 *   [0,1,0]��
 *   [0,0,0]
 * ]
 * Ψһ·���������� 2��
 *
 * ע�⣺ m��n���Ϊ 100��
 */
public class ���ص�·��ii {
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
