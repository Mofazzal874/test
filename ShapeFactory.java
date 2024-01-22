public class ShapeFactory {
    
    private static final ShapeFactory instance = null;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType == "RECTANGLE") {
            return new Rectangle();
        } else if (shapeType== "CIRCLE") {
            return new Square();
        }
        return null;
    }
}