class MyHashMap {
    private static final int SIZE = 1000;
    private List<int[]>[] map;

    public MyHashMap() {
        map = new List[SIZE];

        for (int i = 0; i < SIZE; i++) {
            map[i] = new ArrayList<>();
        }
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    public void put(int key, int value) {
        int idx = getIndex(key);

        for (int[] pair : map[idx]) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }

        map[idx].add(new int[] { key, value });

    }

    public int get(int key) {
        int idx = getIndex(key);

        for (int[] pair : map[idx]) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1;
    }

    public void remove(int key) {
        int idx = getIndex(key);
        Iterator<int[]> it = map[idx].iterator();

        while (it.hasNext()) {
            if (it.next()[0] == key) {
                it.remove();
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */