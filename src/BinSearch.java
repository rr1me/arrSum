public class BinSearch {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;

        int index = binarySearch(sortedArray, target);

        if (index != -1) {
            System.out.println("Элемент " + target + " найден на индексе " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве");
        }
    }

    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}