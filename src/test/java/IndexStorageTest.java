import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {

    @Test
    public void TestSizeIndexStorage() {
        IndexStorage is = new IndexStorage(10);
        Assertions.assertEquals(is.size(), 10);
    }

    @Test
    public void TestReverseIndexStorage() {

        IndexStorage is = new IndexStorage(10);
        System.out.println("is size = " + is.size());

        int[] arr = is.reverse();
        for (int i = 0; i < is.size(); i++) {
            Assertions.assertEquals(is.get(i), arr[is.size() - i - 1]);
            System.out.println("[ " + is.get(i) + " ] - [ " + arr[is.size() - i - 1] + "]");
        }
    }

    @Test
    public void TestGetIndexStorage() {
        IndexStorage is = new IndexStorage(10);
        for (int i = 0; i < is.size(); i++) {
            int index = (i % 2 == 0) ? i : -i;
            Assertions.assertEquals(is.get(i), index);
        }
    }


}
