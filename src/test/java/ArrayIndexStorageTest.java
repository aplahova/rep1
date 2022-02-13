import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayIndexStorageTest {

    @Test
    public void TestGetArrayIndexStorage() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i * 10;
        }
        System.out.println(Arrays.toString(arr));
        ArrayIndexStorage ais = new ArrayIndexStorage(arr);
        for (int i = 0; i < ais.size(); i++) {
            Assertions.assertEquals(ais.get(i), i * 10);
            System.out.println("[ " + ais.get(i) + " = " + i * 10 + " ]");
        }
    }
}
