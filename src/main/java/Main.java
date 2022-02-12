import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        IndexStorage is = new IndexStorage(10);
        System.out.println("is size = " + is.size());

        for (int i = 0; i < is.size(); i++) {
            System.out.print(is.get(i) + " ");
        }
        System.out.println(" ");
        int[] arr = is.reverse();
        System.out.println(Arrays.toString(arr));

        ArrayIndexStorage ais = new ArrayIndexStorage(arr);
        System.out.println("ais size = " + ais.size());
        arr = ais.reverse();
        System.out.println(Arrays.toString(arr));
    }
}
