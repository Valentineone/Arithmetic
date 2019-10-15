package www.epochong.niuke.advance.class_02;

/**
 * 进阶1 111:49
 * 马拉车算法
 * 一个字符串中找到最长回文子串
 *
 * 暴力解法O(N^2)
 * 解决子串为奇数或者偶数 以中心为标准扩展 没有就是自己1
 * 偶回文不好扩展
 * 向整个字符串开头和结尾加东西
 * 11311
 * 处理:  #  1  #  1  #  3   #  1  #   1  #
 * 	     1  3  5  3  1  11  1  3   5  3  1
 * 	     最大值  11 / 2 = 5 就是结果(无论奇 还是 偶)
 * 匹配的过程中虚轴永远和虚轴比对,实轴永远和实轴比对,所以加的字符可以是任意值包括串里面的值
 *
 * O(N)解 大神脑回路异常
 * 回文直径: 串长度
 * 回文半径: 一半长度
 * 准备一个额外的数组回文半径数组arr[]
 * 从左向右依次求回文半径放到数组里面
 * 回文右边界:R
 * #1#2#1#(要加虚轴)
 * 		 R
 * 阔的时候R会跟着走
 * 文右边界的中心:C 跟随R变化
 *
 * 可能性1 回文右边界R在当前位置左边(i 在 R 的外部)  我就暴力扩展
 *
 * i在R得到内部
 * 可能性2 i'的回文半径在L R 完全在内部  O(1)
 * 可能性3 i'的回文半径在L R 在外边      O(1)
 * 可能性4 i'的回文半径正好压线
 *
 * 可能性2 i'彻底在L - R  之间
 * L   i'     c    i     R
 * z k  a  b  a t twoIntegerTo2Pow t a   b   a  k  y
 *   L  l  i' r   C   l'  i   r'    R
 *   i' = 3; C = 6; i = 9; 2 * 6 - 9 = i'
 * 可能性2
 * i的回文区域不用扩, 直接得出答案,多远呢? 就是和i'的回文半径一样
 * 即l' - r'
 * 如果在外部,没有包住则i的回文长度为i - R  (146:20)
 *
 * a   b  c  d  c  b  a  t  t  t  a  b  c  d  c  twoIntegerTo2Pow
 *     X' L  i'    Y'       c        Y     i  R  X
 *  X != X'  X' = Y'  Y' = Y   -->  X != Y
 *
 *  可能性4 i'的回文半径正好压线从R的右边扩
 *  扩的同时R增大
 *
 *  应用4 如果只能在最后添加字符,如何才能在最小的添加成为回文串
 *  abc12321   +  cba
 *  解法: 求包含最后一个的字符1 在内的最长回文子序列,将前面一部分倒序放在后面
 *  这里的manacher不是算到最后一个字符停下来,二十R到最后就马上停(第一次R到最右)
 *  L - R 就是最长子串
 *  #a#b#c#1#2#3#2#1#
 *  	  L	   C    R
 *  加上#才能保证偶回文也行
 *  ab1221  + ba
 *  #a#b#1#2#2#1#1#
 *
 */
public class Code_04_Manacher {

	private static char[] manacherString(String str) {
		char[] charArr = str.toCharArray();
		char[] res = new char[str.length() * 2 + 1];
		int index = 0;
		for (int i = 0; i != res.length; i++) {
			res[i] = (i & 1) == 0 ? '#' : charArr[index++];
		}
		return res;
	}

	/**
	 *  advance 2 , 2:10
	 *
	 */
	private static int maxLcpsLength(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		char[] charArr = manacherString(str);//字符串加#
		int[] pArr = new int[charArr.length];//回文半径数组
		int C = -1;
		int R = -1;
		int max = Integer.MIN_VALUE;
		 /**
		 * 求i的回文中心
		 *
		 */
		for (int i = 0; i != charArr.length; i++) {
			/**
			 * i' = 2 * C - i;
			 * C 取得最右边界的回文中心
			 * R - i 是一个瓶颈
			 * pArr[i'] 回文半径是个瓶颈
			 * 哪个小我的瓶颈就是谁
			 * R >
			 * i ,i 在回文半径里面
			 *
			 * 不用验的区域
			 * 1代表自己
			 * pArr的是在里面的部分不用验
			 */
			pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;
			/**
			 * 4种情况的修改
			 *
			 * 如果要验的区域没越界,左边区域也没越界
			 * 扩出来的东西相等,回文半径相加
			 * 4种情况都扩
			 * 但是情况2,3扩一下就失败
			 *
			 * 1,4有可能成功
			 * 和if else等价,但是让代码更短
			 */
			while (i + pArr[i] < charArr.length && i - pArr[i] > -1) {
				if (charArr[i + pArr[i]] == charArr[i - pArr[i]])
					pArr[i]++;
				else {
					break;
				}
			}
			/**
			 * 如果扩出R了
			 * 要更新R 和 C
			 * 并保存全局最大值
			 */
			if (i + pArr[i] > R) {
				R = i + pArr[i];
				C = i;
			}
			max = Math.max(max, pArr[i]);
		}
		return max - 1;
	}

	public static void main(String[] args) {
		String str1 = "abc1234321ab";
		System.out.println(maxLcpsLength(str1));
	}

}
