import com.sun.xml.internal.ws.transport.http.WSHTTPConnection;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation number: ");
        int o = in.nextInt();

        switch (o){
            case 1: System.out.println("Enter the number: ");
                    int num = in.nextInt();
                    compare(num);
                    break;
            case 2: System.out.println("Enter the name: ");
                    String st = in.next();
                    compare(st);
                    break;
            case 3: inputArray();
        }
    }

    private static void inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter an array element:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        search(array);
    }

    private static void compare(int value){
        if (value > 7){System.out.println("Hello");}
    }
    private static void compare(String value){
        if (value.equals("ֲÿקוסכאג")){System.out.println("Hi, "+ value);}
        else {System.out.println("There is no such name");}
    }
    private static void search(int[] arr){
       IntStream.of(arr).filter(x -> x % 3 == 0).forEach(System.out::println);
    }
}
