package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/21 16:29
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * Description
 * �� n ����Ʒ��һ����СΪ m �ı���. �������� A ��ʾÿ����Ʒ�Ĵ�С������ V ��ʾÿ����Ʒ�ļ�ֵ.
 * �������װ�뱳�����ܼ�ֵ�Ƕ��
 *
 * A[i], V[i], n, m ��Ϊ����
 * �㲻�ܽ���Ʒ�����з�
 * ������ѡ��Ҫװ�뱳������Ʒ���ܴ�С���ܳ��� m
 * ÿ����Ʒֻ��ȡһ��
 * Have you met this question in a real interview?
 * Example
 * ���� 1:
 * ����: m = 10, A = [2, 3, 5, 7], V = [1, 5, 2, 4]
 * ���: 9
 * ����: װ�� A[1] �� A[3] ���Եõ�����ֵ, V[1] + V[3] = 9
 * ���� 2:
 * ����: m = 10, A = [2, 3, 8], V = [2, 5, 8]
 * ���: 10
 * ����: װ�� A[0] �� A[2] ���Եõ�����ֵ, V[0] + V[2] = 10
 * Challenge
 * O (nm) �ռ临�Ӷȿ���ͨ������������Գ��� O (m) �ռ临�Ӷ���
 *
 * ������
 * F(i,j):A[i] > j
 *        F(i - 1,j)
 *        A[i] <= j
 *              A[i]������:F(i - 1, j)
 *              A[i]����:F(i- 1,j - A[i]) + V[i]
 */
public class ��������II {

}
