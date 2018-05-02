/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.nlzh.common.util.spring;

import java.util.Collection;
import java.util.Map;

/**
 * 帮助验证断言的工具类
 */
public class Assert {

	/**
	 * 判断expression是否为true，如果不为true则抛出IllegalArgumentException异常
	 * 示例： Assert.isTrue(1>0,"a不大于0");
	 * @param expression  判断条件
	 * @param message 抛出异常的信息
	 */
	public static void isTrue(boolean expression, String message) {
		if (!expression) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 判断expression是否为true，如果不为true则抛出IllegalArgumentException异常
	 * @param expression 判断条件
	 */
	public static void isTrue(boolean expression) {
		isTrue(expression, "this expression not is true");
	}

	/**
	 * 断言这个对象如果不等于null 则抛出IllegalArgumentException异常
	 * @param object 断言对象
	 * @param message 抛出的异常信息
	 */
	public static void isNull(Object object, String message) {
		if (object != null) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 断言这个对象如果不等于null 则抛出IllegalArgumentException异常
	 * @param object 断言对象
	 */
	public static void isNull(Object object) {
		isNull(object, "[Assertion failed] - the object argument must be null");
	}

	/**
	 * 判断对象不是null，如果为null，抛出IllegalArgumentException异常
	 * @param object 断言对象
	 * @param message 抛出的异常信息
	 */
	public static void notNull(Object object, String message) {
		if (object == null) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 判断对象不是null，如果为null，抛出IllegalArgumentException异常
	 * @param object 断言对象
	 */
	public static void notNull(Object object) {
		notNull(object, "[Assertion failed] - this argument is required; it must not be null");
	}

	/**
	 * 判断text字符串是空的，则抛出IllegalArgumentException异常
	 * @param text 断言字符串
	 * @param message 抛出的异常信息
	 */
	public static void hasLength(String text, String message) {
		if (!StringUtils.hasLength(text)) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 判断text字符串是空的，则抛出IllegalArgumentException异常
	 * @param text 断言字符串
	 */
	public static void hasLength(String text) {
		hasLength(text,
				"this text is null");
	}

	/**
	 *判断字符串去除空格后的字符大于1，如果不大于，则抛出IllegalArgumentException异常
	 * @param text 断言字符串
	 * @param message 抛出的异常信息
	 */
	public static void hasText(String text, String message) {
		if (!StringUtils.hasText(text)) {
			throw new IllegalArgumentException(message);
		}
	}
	
	

	/**
	 *判断字符串去除空格后的字符大于1，如果不大于，则抛出IllegalArgumentException异常
	 * @param text 断言字符串
	 */
	public static void hasText(String text) {
		hasText(text,
				"[Assertion failed] - this String argument must have text; it must not be null, empty, or blank");
	}

	/**
	 * textToSearch字符串是否包含substring字符串，如果包含则抛出异常
	 * @param textToSearch 字符串
	 * @param substring 判断被包含的字符串
	 * @param message 如果textToSearch包含substring抛出的IllegalArgumentException异常信息
	 */
	public static void doesNotContain(String textToSearch, String substring, String message) {
		if (StringUtils.hasLength(textToSearch) && StringUtils.hasLength(substring) &&
				textToSearch.contains(substring)) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * textToSearch字符串是否包含substring字符串，如果包含则抛出异常
	 * @param textToSearch 字符串
	 * @param substring 判断被包含的字符串
	 */
	public static void doesNotContain(String textToSearch, String substring) {
		doesNotContain(textToSearch, substring,
				"[Assertion failed] - this String argument must not contain the substring [" + substring + "]");
	}


	/**
	 * 判断对象数组为null或元素个数为0，抛出异常
	 * @param array 任何对象的数组
	 * @param message 异常信息
	 */
	public static void notEmpty(Object[] array, String message) {
		if (ObjectUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 判断对象数组为null或元素个数为0，抛出异常
	 * @param array 任何对象的数组
	 */
	public static void notEmpty(Object[] array) {
		notEmpty(array, "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
	}

	/**
	 * 判断array数组的元素如果存在null的元素，抛出异常
	 * @param array 数组
	 * @param message 异常信息
	 */
	public static void noNullElements(Object[] array, String message) {
		if (array != null) {
			for (Object element : array) {
				if (element == null) {
					throw new IllegalArgumentException(message);
				}
			}
		}
	}

	/**
	 * 判断array数组的元素如果存在null的元素，抛出异常
	 * @param array 数组
	 */
	public static void noNullElements(Object[] array) {
		noNullElements(array, "[Assertion failed] - this array must not contain any null elements");
	}

	/**
	 * 判断如果集合为null，则抛出异常
	 * @param collection collection集合
	 * @param message 异常信息
	 */
	public static void notEmpty(Collection<?> collection, String message) {
		if (CollectionUtils.isEmpty(collection)) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 判断如果集合为null，则抛出异常
	 * @param collection collection集合
	 */
	public static void notEmpty(Collection<?> collection) {
		notEmpty(collection,
				"[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
	}

	/**
	 * 如果map为null，则抛出异常
	 * @param map map集合
	 * @param message 异常信息
	 */
	public static void notEmpty(Map<?, ?> map, String message) {
		if (CollectionUtils.isEmpty(map)) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * 如果map为null，则抛出异常
	 * @param map map集合
	 */
	public static void notEmpty(Map<?, ?> map) {
		notEmpty(map, "[Assertion failed] - this map must not be empty; it must contain at least one entry");
	}


	/**
	 * 判断如果type对象不是obj类型对象则抛出异常
	 * @param type 对象
	 * @param obj 判断类型的对象
	 */
	public static void isInstanceOf(Class<?> clazz, Object obj) {
		isInstanceOf(clazz, obj, "");
	}

	/**
	 * 判断如果type对象不是obj类型对象则抛出异常
	 * @param type 对象
	 * @param obj 判断类型的对象
	 * @param message 异常信息
	 */
	public static void isInstanceOf(Class<?> type, Object obj, String message) {
		notNull(type, "Type to check against must not be null");
		if (!type.isInstance(obj)) {
			throw new IllegalArgumentException(
					(StringUtils.hasLength(message) ? message + " " : "") +
					"Object of class [" + (obj != null ? obj.getClass().getName() : "null") +
					"] must be an instance of " + type);
		}
	}

	/**
	 * 如果superType不是subType接口类型或是其超类，则抛出异常
	 * @param superType
	 * @param subType
	 */
	public static void isAssignable(Class<?> superType, Class<?> subType) {
		isAssignable(superType, subType, "");
	}

	/**
	 * 如果superType不是subType接口类型或是其超类，则抛出异常
	 * @param superType 
	 * @param subType
	 * @param message
	 */
	public static void isAssignable(Class<?> superType, Class<?> subType, String message) {
		notNull(superType, "Type to check against must not be null");
		// Class.isAssignableFrom(Class)   判定此 Class 对象所表示的类或接口与指定的 Class 参数所表示的类或接口是否相同，或是否是其超类或超接口
		if (subType == null || !superType.isAssignableFrom(subType)) {
			throw new IllegalArgumentException(message + subType + " is not assignable to " + superType);
		}
	}


	/**
	 * Assert a boolean expression, throwing {@code IllegalStateException}
	 * if the test result is {@code false}. Call isTrue if you wish to
	 * throw IllegalArgumentException on an assertion failure.
	 * <pre class="code">Assert.state(id == null, "The id property must not already be initialized");</pre>
	 * @param expression a boolean expression
	 * @param message the exception message to use if the assertion fails
	 * @throws IllegalStateException if expression is {@code false}
	 */
	public static void state(boolean expression, String message) {
		if (!expression) {
			throw new IllegalStateException(message);
		}
	}

	/**
	 * Assert a boolean expression, throwing {@link IllegalStateException}
	 * if the test result is {@code false}.
	 * <p>Call {@link #isTrue(boolean)} if you wish to
	 * throw {@link IllegalArgumentException} on an assertion failure.
	 * <pre class="code">Assert.state(id == null);</pre>
	 * @param expression a boolean expression
	 * @throws IllegalStateException if the supplied expression is {@code false}
	 */
	public static void state(boolean expression) {
		state(expression, "[Assertion failed] - this state invariant must be true");
	}

}
