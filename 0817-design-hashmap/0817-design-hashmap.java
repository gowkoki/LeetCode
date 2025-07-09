class MyHashMap {
    List<int[]> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        boolean keyExist = false;
        for (int[] l : list) {
            if (l[0] == key) {
                l[1] = value;
                keyExist = true;
                return;
            }
        }

        if (!keyExist) {
            list.add(new int[] { key, value });
        }

    }

    public int get(int key) {
        for (int[] l : list) {
            if (l[0] == key) {
                return l[1];
            }
        }
        return -1;
    }

    public void remove(int key) {
        if (get(key) != -1) {
            for (int[] l : list) {
                if (l[0] == key) {
                    list.remove(l);
                    return;
                }
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