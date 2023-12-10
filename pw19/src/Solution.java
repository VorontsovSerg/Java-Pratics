import java.util.*;

class Solution<T, K, V> {
    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public Set<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("The number of keys must match the number of values");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }
}
