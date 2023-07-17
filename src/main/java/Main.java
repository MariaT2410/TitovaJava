import com.sun.xml.internal.ws.transport.http.WSHTTPConnection;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер операции: ");
        int o = in.nextInt();

        switch (o){
            case 1: System.out.println("Введите число: ");
                    int num = in.nextInt();
                    compare(num);
                    break;
            case 2: System.out.println("Введите имя: ");
                    String st = in.next();
                    compare(st);
                    break;
            case 3: inputArray();
        }
    }

    private static void inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        search(array);
    }

    private static void compare(int value){
        if (value > 7){System.out.println("Привет");}
    }
    private static void compare(String value){
        if (value.equals("Вячеслав")){System.out.println("Привет, "+ value);}
        else {System.out.println("Нет такого имени");}
    }
    private static void search(int[] arr){
       IntStream.of(arr).filter(x -> x % 3 == 0).forEach(System.out::println);
    }


    //Задание 4, ответ в текстовой форме:
    //
    //Дана скобочная последовательность: [((())()(())]]
    //Данную последовательность нельзя считать правильной
    //Измененная [((())()(()))]
}
