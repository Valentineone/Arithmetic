package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/28 15:10
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * ������������word1��word2���ҵ���word1ת��Ϊword2�������С����������ÿ��������Ϊ 1 ������
 * ���Ե����������� 3 ��������
 * a�������ַ�
 * b��ɾ���ַ�
 * c���滻�ַ�
 *
 *
 * 1.����״̬F(i,j):word1��ǰi���ַ�ת����Word2��ǰj���ַ�����С��������
 * F(i,j):F(i - 1, j - 1) + �滻i --> j   ѡ����С��min(����,ɾ��,�滻)
 * �滻��F(i - 1,j - 1) + (word1[i] == word2[j] ? 0 : 1)
 * ����:F(i, j - 1) + 1
 * ɾ��:F(i - 1, j) + 1
 * word:"abcde"     word2:"12345"
 * F(1,1):"abcde" --> "1bcde"
 * F(2,2):F(1,1) + (�۲�word1��i����word2��j���ַ��Ƿ����)��word1�ĵ�2���ַ��滻word2�ĵڶ����ַ�(b --> 2):"12cde"
 * F(2,1):"1cde"
 * F(2,2):F(2,1)(ab --> 1) + ����2(12cde)
 *
 * F(i,0)
 *
 */
public class �༭���� {

}
