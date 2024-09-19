import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        //инициализируем коллекцию и сразу наполняем её значениями
        intList.removeIf(i -> i <= 0);//удаляем отрицательные числа
        intList.removeIf(i -> i % 2 != 0);//удаляем нечётные числа

        intList.sort(Comparator.naturalOrder()); //сортируем коллекцию в порядке возрастания

//        List<Integer> oddList=new ArrayList<>();//инициализируем новый список для положительных чисел
//        for(Integer i:intList){
//            if(i%2==0) oddList.add(i); //поиск и добавление положительных чисел в новый лист
//                                       // (в задании не сказано -должен ли это быть новый набор,
//                                        // или в первоначальном оставить только положительные)
//        }
//        oddList.sort(Comparator.naturalOrder());
        System.out.println(intList); //выводим в консоль
    }
}