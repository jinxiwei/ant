package com.king.ant.utils.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @ClassName LambdaUtil
 * @Description lambda表达式工具类
 * @Author King
 * @Date 2019/7/17 0017 - 15:53
 * @Version 1.0
 */
public class CollectionTool {

    /**
     * collection保留过滤
     *
     * @param collection
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> Collection<T> collectionKeepFilter(Collection<T> collection, Predicate<T> predicate) {
        if (collection != null && collection.size() > 0) {
            collection.removeIf(t -> !predicate.test(t));
        }
        return collection;
    }

    /**
     * collection移除过滤
     *
     * @param collection
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> Collection<T> collectionRemoveFilter(Collection<T> collection, Predicate<T> predicate) {
        if (collection != null && collection.size() > 0) {
            collection.removeIf(predicate);
        }
        return collection;
    }

    /**
     * collection遍历
     *
     * @param collection
     * @param consumer
     * @param <T>
     */
    public static <T> void collectionAssignment(Collection<T> collection, Consumer<T> consumer) {
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                consumer.accept(value);
            }
        }
    }

    /**
     * map遍历value
     *
     * @param map
     * @param consumer
     * @param <K>
     * @param <V>
     */
    public static <K, V> void mapAssignmentValue(Map<K, V> map, Consumer<V> consumer) {
        if (map != null && map.size() > 0) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                consumer.accept(entry.getValue());
            }
        }
    }

    /**
     * collection提取某一字段列表list
     *
     * @param collection
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> List<R> chooseIdLinkedList(Collection<T> collection, Function<T, R> function) {
        List<R> resultList = new LinkedList<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                resultList.add(function.apply(value));
            }
        }
        return resultList;
    }

    /**
     * collection提取某一字段列表list
     *
     * @param collection
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> List<R> chooseIdArrayList(Collection<T> collection, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                resultList.add(function.apply(value));
            }
        }
        return resultList;
    }

    /**
     * list提取某一字段并去重set
     *
     * @param collection
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> Set<R> chooseIdSet(Collection<T> collection, Function<T, R> function) {
        Set<R> resultSet = new HashSet<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                resultSet.add(function.apply(value));
            }
        }
        return resultSet;
    }

    /**
     * collection转换成map
     *
     * @param collection
     * @param keyFunction
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> Map<K, V> collectionChangeToHashMap(Collection<V> collection, Function<V, K> keyFunction) {
        Map<K, V> resultMap = new HashMap<>();
        if (collection != null && collection.size() > 0) {
            for (final V value : collection) {
                resultMap.put(keyFunction.apply(value), value);
            }
        }
        return resultMap;
    }

    /**
     * 将collection转换成map
     *
     * @param collection
     * @param keyFunction
     * @param valueFunction
     * @param <T>
     * @param <K>
     * @param <V>
     * @return
     */
    public static <T, K, V> Map<K, V> collectionChangeToHashMap(Collection<T> collection, Function<T, K> keyFunction, Function<T, V> valueFunction) {
        Map<K, V> resultMap = new HashMap<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                resultMap.put(keyFunction.apply(value), valueFunction.apply(value));
            }
        }
        return resultMap;
    }

    /**
     * collection转换成hashMapList
     *
     * @param collection
     * @param keyFunction
     * @param <T>
     * @param <K>
     * @return
     */
    public static <T, K> Map<K, List<T>> collectionChangeToHashMapList(Collection<T> collection, Function<T, K> keyFunction) {
        Map<K, List<T>> resultMap = new HashMap<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                List<T> valueList = resultMap.get(keyFunction.apply(value));
                if (valueList == null) {
                    valueList = new LinkedList<>();
                }
                valueList.add(value);
                resultMap.put(keyFunction.apply(value), valueList);
            }
        }
        return resultMap;
    }

    /**
     * collection转换成hashMapList
     *
     * @param collection
     * @param keyFunction
     * @param valueFunction
     * @param <T>
     * @param <K>
     * @return
     */
    public static <T, K> Map<K, List<T>> collectionChangeToHashMapList(Collection<T> collection, Function<T, K> keyFunction, Function<T, T> valueFunction) {
        Map<K, List<T>> resultMap = new HashMap<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                List<T> valueList = resultMap.get(keyFunction.apply(value));
                if (valueList == null) {
                    valueList = new LinkedList<>();
                }
                valueList.add(valueFunction.apply(value));
                resultMap.put(keyFunction.apply(value), valueList);
            }
        }
        return resultMap;
    }

    /**
     * collection转换成hashMapList
     *
     * @param collection
     * @param keyFunction
     * @param valueFunction
     * @param predicate
     * @param <T>
     * @param <K>
     * @return
     */
    public static <T, K> Map<K, List<T>> collectionChangeToHashMapList(Collection<T> collection, Function<T, K> keyFunction, Function<T, T> valueFunction, Predicate<T> predicate) {
        Map<K, List<T>> resultMap = new HashMap<>();
        if (collection != null && collection.size() > 0) {
            for (final T value : collection) {
                List<T> valueList = resultMap.get(keyFunction.apply(value));
                if (valueList == null) {
                    valueList = new LinkedList<>();
                }
                if (predicate.test(value)) {
                    valueList.add(valueFunction.apply(value));
                }
                resultMap.put(keyFunction.apply(value), valueList);
            }
        }
        return resultMap;
    }

    /**
     * map转换成list
     *
     * @param map
     * @param function
     * @param <T>
     * @param <K>
     * @param <V>
     * @return
     */
    public static <T, K, V> List<T> mapChangeToArrayList(Map<K, V> map, Function<V, T> function) {
        List<T> resultList = new ArrayList<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                resultList.add(function.apply(entry.getValue()));
            }
        }
        return resultList;
    }

    /**
     * map转换成list
     *
     * @param map
     * @param function
     * @param <T>
     * @param <K>
     * @param <V>
     * @return
     */
    public static <T, K, V> List<T> mapChangeToLinkedList(Map<K, V> map, Function<V, T> function) {
        List<T> resultList = new LinkedList<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                resultList.add(function.apply(entry.getValue()));
            }
        }
        return resultList;
    }

}
