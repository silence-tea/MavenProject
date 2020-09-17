package stream.lambda;

public class PricePredicate implements MyPredicate<Product>{
    @Override
    public boolean test(Product product) {
        return product.getPrice() < 8000;
    }
}
