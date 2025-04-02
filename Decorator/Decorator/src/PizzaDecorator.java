public class PizzaDecorator extends BasePizza{
    BasePizza basePizza;

    public PizzaDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost();
    }
}
