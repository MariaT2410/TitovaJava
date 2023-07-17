import com.sun.xml.internal.ws.transport.http.WSHTTPConnection;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ��������: ");
        int o = in.nextInt();

        switch (o){
            case 1: System.out.println("������� �����: ");
                    int num = in.nextInt();
                    compare(num);
                    break;
            case 2: System.out.println("������� ���: ");
                    String st = in.next();
                    compare(st);
                    break;
            case 3: inputArray();
        }
    }

    private static void inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("������� ������� �������:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        search(array);
    }

    private static void compare(int value){
        if (value > 7){System.out.println("������");}
    }
    private static void compare(String value){
        if (value.equals("��������")){System.out.println("������, "+ value);}
        else {System.out.println("��� ������ �����");}
    }
    private static void search(int[] arr){
       IntStream.of(arr).filter(x -> x % 3 == 0).forEach(System.out::println);
    }


    //������� 4, ����� � ��������� �����:
    //
    //���� ��������� ������������������: [((())()(())]]
    //������ ������������������ ������ ������� ����������
    //���������� [((())()(()))]
}
