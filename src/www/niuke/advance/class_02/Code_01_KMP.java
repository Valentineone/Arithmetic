package www.niuke.advance.class_02;
/**
* @date 2019/3/2
* @describe 初级 one 7:00
 *匹配程度：某个字符前面最长前缀和最长后缀的匹配个数
 *
 * getIndexOf(str1,str2)(KMP 实现)
 * 时间复杂度O(N)
 *
 * Java中的一些getIndexOf() 比KMP快
 *
 * 前缀不能到最后一个
 * 后缀不能打第一个
 * next 取前后缀最长匹配长度
 * str1 看包不包含str2
 * 0  1  2  3  4  5  next
 * -1 0  1			 值
 * 		 0
 *
 * 91:53 京东原题
 * 原始 abcabc 在末尾添加字符串 使得包含两个原始串，开头不能一样,满足这样的最短串是什么
 * 答案 abcabcabc
 * 解法 求原始串next数组  在求终止位置的next值
 *  a a a a a
 * -1 0 1 2 3 4
 *
 * 98:00 应用2
 * 给你两颗树
 * 		T1				T2
 *      1			  1
 *  1       1		1
 * 1  1   1
 * T1中是否包含一颗子树，和T2相等(结构和值都相等)
 * (子树：从子结点开始，我下面的全部要，包含该子结点
 * 解法：把一棵树序列化(basic 一定要会)
 * 先序1_1_1_#_#_1_#_#_1_1_#_#_#_(可以代表二叉树的结构,有结点结束符_ 有空节点表示#就能唯一确定结构)
 * 反序列化怎么序列化怎么反
 *
 * 应用3 你怎么确定一个大字符串由一个小字符串重复的到的
 * 123123123123123
 * 解法：将每一个字符的next算出来,求相同的字符的next值为某个数的整数倍
 *
*/
public class Code_01_KMP {
	/**
	 * 60:00
	 * @param s
	 * @param m
	 * @return
	 */
	private static int getIndexOf(String s, String m) {
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1;
		}
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);
		while (si < ss.length && mi < ms.length) {
			if (ss[si] == ms[mi]) {
				si++;
				mi++;
			} else if (next[mi] == -1) {
				si++;
			} else {
				mi = next[mi];
			}
		}
		return mi == ms.length ? si - mi : -1;
	}

	/**
	 * 74:00
	 * ababcababak 求k的next
	 * c  a 没对上
	 * c跳两坨
	 * a 和 a 对上了
	 * c的前缀是2 加 1 为 3 就是k的next
	 * @param str2 待求next数组字符串
	 * @return 返回next数组
	 */
	private static int[] getNextArray(char[] str2) {
		if (str2.length == 1) {
			return new int[] { -1 };
		}
		int[] next = new int[str2.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2; //每一个的位置
		int cn = 0;  //跳到的位置
		while (pos < next.length) {
			if (str2[pos - 1] == str2[cn]) {//前一个字符和跳到的位置相等
				next[pos++] = ++cn;
			} else if (cn > 0) {// 我还可以往前跳 next数组的那个值就是我要去的位置
				cn = next[cn];
			} else {//跳无可跳
				next[pos++] = 0;
			}
		}
		return next;
	}

	public static void main(String[] args) {
		String str = "abcabcababaccc";
		String match = "ababa";
		System.out.println(getIndexOf(str, match));

	}

}
