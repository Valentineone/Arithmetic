package www.epochong.niuke.advance.class_02;

/**
 * 火车撞了都不能忘
 * 第二节会学窗口内最大值和最小值更新结构
 * 单调栈结构
 *
 * 91:53 京东原题
 * 原始 abcabc 在末尾添加字符串 使得包含两个原始串，开头不能一样,满足这样的最短串是什么
 * 答案 abcabcabc
 * 解法 求原始串next数组  在求终止位置的next值
 *  a a a a a
 * -1 0 1 2 3 4
 *
 */
public class Code_02_KMP_ShortestHaveTwice {

	public static String answer(String str) {
		if (str == null || str.length() == 0) {
			return "";
		}
		char[] chas = str.toCharArray();
		if (chas.length == 1) {
			return str + str;
		}
		if (chas.length == 2) {
			return chas[0] == chas[1] ? (str + String.valueOf(chas[0])) : (str + str);
		}
		int endNext = endNextLength(chas);
		return str + str.substring(endNext);
	}

	public static int endNextLength(char[] chas) {
		int[] next = new int[chas.length + 1];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (chas[pos - 1] == chas[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next[next.length - 1];
	}

	public static void main(String[] args) {
		String test1 = "a";
		System.out.println(answer(test1));

		String test2 = "aa";
		System.out.println(answer(test2));

		String test3 = "ab";
		System.out.println(answer(test3));

		String test4 = "abcdabcd";
		System.out.println(answer(test4));

		String test5 = "abracadabra";
		System.out.println(answer(test5));

	}

}
