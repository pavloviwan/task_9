/**
 *Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 * где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */

import java.io.IOException;
import java.util.Scanner;

public class Task9 {
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int x=0; x < size; x++) array [x] = scanner.nextInt();
        System.out.println("Результат:");
        for (int x = 0; x < size; x++) System.out.print(array[x]*2+",");
    }

    }

