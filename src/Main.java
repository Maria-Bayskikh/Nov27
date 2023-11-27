import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапозон");
        int n = scanner.nextInt();
        List<Range> ranges = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Введите начало диапозона:");
            int start = scanner.nextInt();
            System.out.println("Введите конец диапозона:");
            int end = scanner.nextInt();

            if (start > end){
                System.out.println("Ошибка: диапозон больше, чем конец");
                continue;
            }
            ranges.add(new Range(start, end));
        }
        for (Range range : ranges){
            System.out.println(range);
        }

        }
    }
