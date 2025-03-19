public class Jalapeno extends BasePizza{
    BasePizza basePizza;

    public Jalapeno(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
