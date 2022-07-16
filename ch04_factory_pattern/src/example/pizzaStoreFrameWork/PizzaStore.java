package example.pizzaStoreFrameWork;

public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);

	// 심플팩코리 예제에서는, 피자가게에서 orderPizza(); 피자를 주문하면 피자생성공장에서 createPizza(); 피자를 생성했는데
	// TODO : 해당 예제에서는 피자가게에서 orderPizza(); 와 createPizza(); 를 둘다 하네..
	// 근데 실질적으로 createPizza(); 피자를 만드는 행위는 PizzaStore 의 자식 클래스 ex. NYPizzaStore 에서 하고 있네.
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
