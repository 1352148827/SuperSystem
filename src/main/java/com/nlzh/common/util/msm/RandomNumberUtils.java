package com.nlzh.common.util.msm;

public final class RandomNumberUtils {
	
	/**
	 * 随机生成一个6位数的字符串(验证码)
	 * @return
	 */
	public static String getRandomCode() {
		String str = "";
		str += (int) (Math.random() * 9 + 1);
		for (int i = 0; i < 5; i++) {
			str += (int) (Math.random() * 10);
		}
		return str;
	}
}
