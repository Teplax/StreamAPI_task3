import java.util.ArrayList;
import java.util.Arrays;

public class StreamMain {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        //инициализируем коллекцию и сразу наполняем её значениями
        intList.stream()  //запускаем поток
                .filter(i-> i > 0) //оставляем только положительные элементы
                .filter(n-> n%2==0) //фильтруем чётные значения
                .sorted() //сортируем поток в порядке возрастания
                .forEach(System.out::println); //выводим финальный поток на экран
    }
}
