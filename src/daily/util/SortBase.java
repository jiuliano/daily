package daily.util;

public class SortBase {
    public void swap(String[] list, int i1, int i2) {
        String temp = list[i2];
        list[i2] = list[i1];
        list[i1] = temp;
    }
}
