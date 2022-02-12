public class IndexStorage {
    protected int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return (index % 2 == 0) ? index : -index;
    }

    public int[] reverse() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = get(size - i - 1);
        }
        return arr;
    }
}
