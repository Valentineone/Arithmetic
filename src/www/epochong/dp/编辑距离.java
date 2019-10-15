package www.epochong.dp;

/**
 * @author epochong
 * @date 2019/7/28 15:10
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 给定两个单词word1和word2，找到将word1转换为word2所需的最小步骤数。（每个操作计为 1 步。）
 * 您对单词允许以下 3 个操作：
 * a）插入字符
 * b）删除字符
 * c）替换字符
 *
 *
 * 1.定义状态F(i,j):word1的前i个字符转换成Word2的前j个字符的最小操作次数
 * F(i,j):F(i - 1, j - 1) + 替换i --> j   选择最小的min(插入,删除,替换)
 * 替换：F(i - 1,j - 1) + (word1[i] == word2[j] ? 0 : 1)
 * 插入:F(i, j - 1) + 1
 * 删除:F(i - 1, j) + 1
 * word:"abcde"     word2:"12345"
 * F(1,1):"abcde" --> "1bcde"
 * F(2,2):F(1,1) + (观察word1第i个和word2第j个字符是否相等)将word1的第2个字符替换word2的第二个字符(b --> 2):"12cde"
 * F(2,1):"1cde"
 * F(2,2):F(2,1)(ab --> 1) + 插入2(12cde)
 *
 * F(i,0)
 *
 */
public class 编辑距离 {

}
