package stream.lambda;

/**
 * @author Administrator
 */
public class ColorPredicate implements MyPredicate<Product>{
    private static final String RED = "红色";

    @Override
    public boolean test(Product product) {
        return RED.equals(product.getColor());
    }

}
