package example.simplePizzaFactory;

import example.simplePizzaFactory.pizza.*;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 심플 피자 팩토리 클래스를 만들어서,
        // 주석처리한 부분을 -> pizza = factory.createPizza(type); 메소드로 작성해놓음
        // TODO : 변경 가능한 부분
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }
        pizza = factory.createPizza(type);

        // TODO : 변경 불가한 부분
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
