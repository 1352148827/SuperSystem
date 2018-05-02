package com.nlzh.common.util.spring;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {

	/**
	 * 判断集合是否为null
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return (collection == null || collection.isEmpty());
	}

	/**
	 * 判断map是否为null
	 * @param map
	 * @return
	 */
	public static boolean isEmpty(Map<?, ?> map) {
		return (map == null || map.isEmpty());
	}

	


}
