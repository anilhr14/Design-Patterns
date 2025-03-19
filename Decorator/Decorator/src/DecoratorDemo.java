public class DecoratorDemo {
    public static void main(String[] args) {
       BasePizza newPizza = new ExtraCheese(new Mushroom(new Jalapeno(new Margherita())));
        System.out.println("Pizza final cost = "+newPizza.cost());
    }
}