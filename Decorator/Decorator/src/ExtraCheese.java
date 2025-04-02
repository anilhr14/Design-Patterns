public class ExtraCheese extends PizzaDecorator{

    public ExtraCheese(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
