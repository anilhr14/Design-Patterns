public class ShapeFactory {


    public Shape getShape(String str){
        switch(str){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }




}
