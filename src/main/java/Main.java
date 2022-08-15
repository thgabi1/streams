import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Béla", "Júlia", "Dezső", "Anna");
        List<String> names2 = new ArrayList<>();

        names.stream()
                .filter(n -> n.length() > 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Double result = Stream.generate(Math::random)
                .limit(10)
                .reduce(0.0, Double::sum);

        System.out.println(result);
    }
}
