package algoritmer;

public class BinarySearchRecursive {

    //    COPY:
    static int binarySearch(int search_value, int[] values, int left, int right) {
        int middle = (left + right / 2);

        if (right - left == 0) {
            if (values[middle] == search_value) {
                return middle;
            } else {
                return -middle;
            }
        }

        if (values[middle] <= search_value) {
            if (values[middle] == search_value) {
                return middle;
            }

            return binarySearch(search_value, values, middle + 1, right);
        } else {
            return binarySearch(search_value, values, left, middle - 1);
        }
    }
//
}
