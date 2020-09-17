package stream.lambda;

public class Product {
    private String color;

    private int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
