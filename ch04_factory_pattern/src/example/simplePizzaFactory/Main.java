package example.simplePizzaFactory;

import example.simplePizzaFactory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        // 심플피자팩토리 인스턴스 생성
        SimplePizzaFactory factory = new SimplePizzaFactory();
        // 피자가게 인스턴스 생성
        PizzaStore store = new PizzaStore(factory);

        // 가게(store)에 치즈 피자 주문
        System.out.println("치즈 피자 들어갑니다..");
        Pizza pizza = store.orderPizza("cheese"); // Pizza pizza = = new CheesePizza();
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
        System.out.println("치즈 피자 나왔습니다.." + "\n");

        // 가게(store)에 야체 피자 주문
        System.out.println("야채 피자 들어갑니다..");
        pizza = store.orderPizza("veggie"); // Pizza pizza = = new VeggiePizza();
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
        System.out.println("야채 피자 나왔습니다..");

    }
}
