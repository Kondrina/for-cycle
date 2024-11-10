import java.util.Scanner;

public class Main {
    //    Задание 2
//    + Создайте новый проект и назовите его ForCycle.
//    + Создайте класс Main и метод main.
//    Создайте переменную типа int и получите её значение из консоли:
//    int value = new Scanner(System.in).nextInt();
//    Напишите программу, которая будет находить все пары положительных целых чисел, произведение которых будет равно
//    значению value. Например, если ввести число 6, программа должна выдать следующий результат:
//            1*6
//            2*3
//            3*2
//            6*1
//    Рекомендации по выполнению
//
//Для написания программы используйте два цикла for — один, вложенный в другой.
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        for (int sum = 0; sum <= value; sum++) {
            for (int sum1 = 0; sum1 <= value; sum1++) {
                if (sum * sum1 == value) {
                    System.out.println(sum + "*" + sum1);
                }
            }
        }
    }
}