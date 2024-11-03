public class BinarySearch {

    // Метод бинарного поиска
    public static int binarySearch(int[] arr, int target) {
        int low = 0;                // Начало диапазона
        int high = arr.length - 1; // Конец диапазона

        while (low <= high) {
            int mid = low + (high - low) / 2; // Находим середину

            // Проверяем, совпадает ли целевое значение со средним элементом
            if (arr[mid] == target) {
                return mid; // Возвращаем индекс, если элемент найден
            }

            // Если целевое значение больше среднего элемента, ищем в правой части
            if (arr[mid] < target) {
                low = mid + 1;
            }
            // Если целевое значение меньше среднего элемента, ищем в левой части
            else {
                high = mid - 1;
            }
        }

        return -1; // Возвращаем -1, если элемент не найден
    }

    public static void main(String[] args) {
        // Пример отсортированного массива
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7; // Искомый элемент

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
}


