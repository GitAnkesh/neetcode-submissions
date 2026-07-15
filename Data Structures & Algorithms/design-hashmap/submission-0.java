
class MyHashMap {

    LinkedList<KeyValue>[] buckets;
    int SIZE = 10000;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];

        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return Math.floorMod(key, SIZE);
    }

    public void put(int key, int value) {
        int index = hash(key);

        for (KeyValue kv : buckets[index]) {
            if (kv.key == key) {
                kv.val = value; // update existing key
                return;
            }
        }

        KeyValue kv = new KeyValue();
        kv.key = key;
        kv.val = value;

        buckets[index].add(kv);
    }

    public int get(int key) {
        int index = hash(key);

        for (KeyValue kv : buckets[index]) {
            if (kv.key == key) {
                return kv.val;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);

        KeyValue target = null;

        for (KeyValue kv : buckets[index]) {
            if (kv.key == key) {
                target = kv;
                break;
            }
        }

        if (target != null) {
            buckets[index].remove(target);
        }
    }

    class KeyValue {
        int key;
        int val;

        public int getKey() {
            return this.key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return this.val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
}