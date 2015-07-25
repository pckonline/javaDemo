package UseObject;

/**
 * Created by online on 14-12-7.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = arrToString(arr);
        System.out.println(s);
        StringBuilder tb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                tb.append(arr[i] + ",");
            } else {
                tb.append(arr[i] + "]");
            }
        }
        System.out.println(tb);
    }

    public static String arrToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ",";
            } else {
                str += arr[i] + "]";
            }
        }
        return str;
    }
}
