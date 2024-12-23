package JEP356EnhancedPseudoRandom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomTest {

    public static void main(String[] args) {
        exampleOFNewAPI();
    }

    public static void testRandom() {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(number);
    }

    //3. New RandomGenerator API
    public static void exampleOFNewAPI(){
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
        ExecutorService executorService = Executors.newCachedThreadPool();

        RandomGenerator.SplittableGenerator sourceGenerator = RandomGeneratorFactory
                .<RandomGenerator.SplittableGenerator>of("L128X256MixRandom")
                .create();

        sourceGenerator.splits(8).forEach((splitGenerator) -> {
            executorService.submit(() -> {
                numbers.add(splitGenerator.nextInt(10));
            });
        });

        numbers.forEach(System.out::println);

    }
}
