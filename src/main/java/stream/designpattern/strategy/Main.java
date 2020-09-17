package stream.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        Context context1 = new Context(new ConcreteStrategyB());
        context1.ContextInterface();
    }
}
