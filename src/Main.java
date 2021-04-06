import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Laptops> laptops = new ArrayList<>();

        laptops.add(new Laptops("Acer", "Predator", 8136421, 40000));
        laptops.add(new Laptops("Asus", "ROG", 8136421, 50000));
        laptops.add(new Laptops("HP", "Pavilion", 8136421, 45000));
        laptops.add(new Laptops("Dell", "Alienware", 8136421, 60000));
        laptops.add(new Laptops("Apple", "MacBook", 8136421, 52000));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите производителя");
        String resultMaker = scan.next();
        System.out.println("Введите модель");
        String resultModelSeries = scan.next();
        System.out.println("Введите макс. цену");
        Integer resultMaxPrice = scan.nextInt();

//        List<Laptops> laptopsFiltering = laptops.stream()
//                .filter(maker -> maker.getMaker().equals(resultMaker))
//                .filter(modelSeries -> modelSeries.getModelSeries().equals(resultModelSeries))
//                .filter(price -> price.getPrice() <= resultMaxPrice)
//                .collect(Collectors.toList());
//
//        System.out.println(laptopsFiltering);

        Filterable makerFiltered = maker -> maker.getMaker().equals(resultMaker);
        Filterable modelSeriesFiltered = modelSeries -> modelSeries.getModelSeries().equals(resultModelSeries);
        Filterable priceFiltered = price -> price.getPrice() <= resultMaxPrice;

        System.out.println("---------------------------");
        System.out.println("Фильтрованные производители:");
        laptops.forEach(maker -> System.out.println(makerFiltered.filter(maker)));
        System.out.println("---------------------------");
        System.out.println("Фильтрованные Серийные модели:");
        laptops.forEach(modelSeries -> System.out.println(modelSeriesFiltered.filter(modelSeries)));
        System.out.println("---------------------------");
        System.out.println("Фильтрованные цены:");
        laptops.forEach(price -> System.out.println(priceFiltered.filter(price)));
    }
}
@FunctionalInterface
interface Filterable{
    boolean filter(Laptops modelSeries);
}