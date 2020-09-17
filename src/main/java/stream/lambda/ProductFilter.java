package stream.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class ProductFilter {
    private static List<Product> filterProductByPredicate(List<Product> list, MyPredicate<Product> mp) {
        List<Product> prods = new ArrayList<>();
        for (Product prod : list) {
            if (mp.test(prod)) {
                prods.add(prod);
            }
        }
        return prods;
    }


    public static void main(String[] args) {
        Product product = new Product();
        product.setColor("红色");
        product.setPrice(99999);
        Product product1 = new Product();
        product1.setColor("黑色");
        product1.setPrice(5000);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        //设计模式
        ColorPredicate colorPredicate = new ColorPredicate();
        System.out.println("colorPredicate:" + colorPredicate.test(product));
        PricePredicate pricePredicate = new PricePredicate();
        System.out.println("pricePredicate:" + pricePredicate.test(product));
        List<Product> productList1 = filterProductByPredicate(productList, colorPredicate);
        System.out.println("productList1:");
        for (Product p : productList1) {
            System.out.println(p.toString());
        }
        //匿名内部类
        List<Product> productList2 = filterProductByPredicate(productList, new MyPredicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() < 8000;
            }
        });
        System.out.println("productList2:");
        for (Product p : productList2) {
            System.out.println(p.toString());
        }
    }

    private List<Product> getProductList() {
        Product product = new Product();
        product.setColor("红色");
        product.setPrice(99999);
        Product product1 = new Product();
        product1.setColor("黑色");
        product1.setPrice(5000);
        Product product2 = new Product();
        product2.setColor("白色");
        product2.setPrice(7999);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        return productList;
    }

    @Test
    public void test4() {
        List<Product> productList = getProductList();
        List<Product> productList1 = filterProductByPredicate(productList, (p) -> p.getPrice() < 8000);
        for (Product pro : productList1) {
            System.out.println(pro);
        }
        System.out.println();
        List<Product> productList2 = filterProductByPredicate(productList, new MyPredicate<Product>() {
            @Override
            public boolean test(Product product) {
                return "红色".equals(product.getColor());
            }
        });
        for (Product pro : productList2) {
            System.out.println(pro);
        }
        System.out.println();
        List<Product> productList3 = filterProductByPredicate(productList, (p2) -> "白色".equals(p2.getColor()));
        for (Product pro : productList3) {
            System.out.println(pro);
        }
    }

    /**
     * lambda
     */
    @Test
    public void streamTest() {
        List<Product> productList = getProductList();
        // 根据价格过滤
        System.out.println("价格：");
        productList.stream()
                .filter((p) -> p.getPrice() < 8000)
                .limit(2)
                .forEach(System.out::println);
        //根据颜色过滤
        System.out.println("颜色：");
        productList.stream().filter((p) -> "红色".equals(p.getColor())).forEach(System.out::print);
        //输出所有条目
        System.out.println("所有：");
        productList.stream().map(Product::getColor).forEach(System.out::println);
    }

}
