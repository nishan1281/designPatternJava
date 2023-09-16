import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house); //using List.of is immutable

        ProductFilter pf = new ProductFilter();
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(
                        " _ " + p.name + " is green"
                ));


        System.out.println("NEW with BF");
        BetterFilter bf = new BetterFilter();
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println
                        (" _ " + p.name + " is green"));


        System.out.println("NEW with And specification");
        bf.filter(products, new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)
                ))
                .forEach(p -> System.out.println
                        (" _ " + p.name + " is large and blue"));

    }


}
