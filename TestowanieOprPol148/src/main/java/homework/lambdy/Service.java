package homework.lambdy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Service {

    public static void main(String[] args) {
        Service service = new Service();
        service.run();
    }

    public void run() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> collect1 = ints.stream()
                // zastosowanie lambdy
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        collect1.forEach(System.out::println);

        System.out.println("-------");

        List<Integer> collect = ints.stream()
                // zastosowanie klasy anonimowej
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer number) {
                        return number % 2 == 0;
                    }
                })
                .collect(Collectors.toList());

        collect.forEach(number -> System.out.println(number));
    }
}
