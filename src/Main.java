public class  Main {
    public static void main(String[] args) {
        int[] numbers = {5, 12, -3, 7, 20, 0};

        int sum = calculateSum(numbers);

        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int calculateSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}