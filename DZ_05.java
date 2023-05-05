import java.util.Arrays;
import java.util.HashMap;

public class DZ_05 {
    public static void main(String[] args) {
        // Задача 2 сортировка
        int[] array = {77, 46, 11, 89, 48, 14, 67, 73, 22, 26, 47, 1, 67, 23, 4};
        heapSort(array);
        System.out.println(Arrays.toString(array));
        
        // Задание 1
        HashMap<Integer, String> book = new HashMap<>();
        book.put(8912978, "Иван Иванов");
        book.put(8912979, "Светлана Петрова");
        book.put(8912910, "Кристина Белова");
        book.put(8912911, "Анна Мусина");
        book.put(8912912, "Анна Крутова");
        book.put(8912913, "Иван Юрин");
        book.put(8912914, "Петр Лыков");
        book.put(8912915, "Павел Чернов");
        book.put(8912916, "Петр Чернышов");
        book.put(8912917, "Мария Федорова");
        book.put(8912918, "Марина Светлова");
        book.put(8912919, "Мария Савина");
        book.put(8912920, "Мария Рыкова");
        book.put(8912921, "Марина Лугова");
        book.put(8912922, "Анна Владимирова");
        book.put(8912923, "Иван Мечников");
        book.put(8912924, "Петр Петин");
        book.put(8912925, "Иван Ежов");
    }
// начало функций для сортировки
{
//вернуть левого потомка `A[i]`
private static int LEFT(int i) {
    return (2 * i + 1);
}

//вернуть правого потомка `A[i]`
private static int RIGHT(int i) {
    return (2 * i + 2);
}

//вспомогательная функция для замены двух индексов в массиве
private static void swap(int[] sortArr, int i, int j) {
    int swap = sortArr[i];
    sortArr[i] = sortArr[j];
    sortArr[j] = swap;
}

//рекурсивный алгоритм heapify-down. Узел с индексом `i` и 2 его прямых потомка нарушают свойство кучи
private static void heapify(int[] sortArr, int i, int size) {
    // получить левый и правый потомки узла с индексом `i`
    int left = LEFT(i);
    int right = RIGHT(i);
    int largest = i;

    //сравниваем `A[i]` с его левым и правым дочерними элементами и находим наибольшее значение
    if (left < size && sortArr[left] > sortArr[i]) largest = left;
    if (right < size && sortArr[right] > sortArr[largest]) largest = right;

    //поменяться местами с потомком, имеющим большее значение и вызовите heapify-down для дочернего элемента
    if (largest != i) {
        swap(sortArr, i, largest);
        heapify(sortArr, largest, size);
    }
}

//функция для удаления элемента с наивысшим приоритетом (присутствует в корне)
private static int pop(int[] sortArr, int size) {
    //если в куче нет элементов
    if (size <= 0) {
        return -1;
    }
    int top = sortArr[0];

    //заменяем корень кучи последним элементом массива
    sortArr[0] = sortArr[size-1];
    //вызовите heapify-down на корневом узле
    heapify(sortArr, 0, size - 1);
    return top;
}

//функция для выполнения пирамидальной сортировки массива `A` размера `n`
public static void heapSort(int[] sortArr) {
    //строим приоритетную очередь и инициализируем ее заданным массивом
    int n = sortArr.length;

    //build-heap: вызывать heapify, начиная с последнего внутреннего
    //узел до корневого узла
    int i = (n - 2) / 2;
    while (i >= 0) {
        heapify(sortArr, i--, n);
    }

    //несколько раз извлекаем из кучи, пока она не станет пустой
    while (n > 0) {
        sortArr[n - 1] = pop(sortArr, n);
        n--;
    }
}

private static void main(String args[]) {
    int[] sortArr = {12, 6, 4, 1, 15, 10};
    heapSort(sortArr);
    for(int i = 0; i < sortArr.length; i++){
        System.out.print(sortArr[i] + "\n");
    }
}
}
// конец функций для сортировки


}