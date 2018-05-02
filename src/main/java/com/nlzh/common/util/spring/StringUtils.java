/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nlzh.common.util.spring;

import java.util.Collection;

/**
 * 字符串工具类
 * @author 13521
 *
 */
public class StringUtils {



	/**
	 * 字符串如果等于null或"",则返回true
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}

	/**
	 * 如果字符串不等于null或长度大于0返回true
	 * @param str
	 * @return
	 */
	public static boolean hasLength(CharSequence str) {
		return (str != null && str.length() > 0);
	}

	/**
	 * 如果字符串不等于null或长度大于0返回true
	 * @param str
	 * @return
	 */
	public static boolean hasLength(String str) {
		return hasLength((CharSequence) str);
	}
	
	/**
	 * 判断去除空格后的字符串长度大于1
	 * 
	 * 检查给定字符串是否有实际文本。 更具体地说，
	 * 如果字符串不为null，返回true，它的长度是大于0的，它至少包含一个非空格字符。
	 * @param str
	 * @return
	 */
	public static boolean hasText(String str) {
		return hasText((CharSequence) str);
	}

	/**
	 * 判断去除空格后的字符串长度大于1
	 * 
	 * 检查给定字符串是否有实际文本。 更具体地说，
	 * 如果字符串不为null，返回true，它的长度是大于0的，它至少包含一个非空格字符。
	 * @param str
	 * @return
	 */
	public static boolean hasText(CharSequence str) {
		if (!hasLength(str)) {
			return false;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 将给定集合复制到字符串数组中，集合必须只包含字符串元素
	 * @param collection
	 * @return
	 */
	public static String[] toStringArray(Collection<String> collection) {
		if (collection == null) {
			return null;
		}
		return collection.toArray(new String[collection.size()]);
	}

	

}
