package com.king.ant.utils.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName ArrayTool
 * @Description 数组工具类
 * @Author Administrator
 * @Date 2019/8/5 0005 - 16:05
 * @Version 1.0
 */
public class ArrayTool {

    /**
     * 数组遍历
     *
     * @param array
     * @param consumer
     * @param <T>
     */
    public static <T> void arrayAssignment(T[] array, Consumer<T> consumer) {
        if (array != null && array.length > 0) {
            for (final T value : array) {
                consumer.accept(value);
            }
        }
    }

    public static <T, K, V> Map<K, V> arrayChangeToHashMap(T[] array, Function<T, K> keyFunction, Function<T, V> valueFunction) {
        Map<K, V> resultMap = new HashMap<>();
        if (array != null && array.length > 0) {
            for (final T value : array) {
                resultMap.put(keyFunction.apply(value), valueFunction.apply(value));
            }
        }
        return resultMap;
    }

}
