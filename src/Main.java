
class Main {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        System.out.println("tri.getName() = " + tri.getName());
        Shape obj1 = new Circle();
        System.out.println("obj1.getName() = " + obj1.getName());
        Shape kvad = new Quad("Quad");
        System.out.println("kvad.getName() = " + kvad.getName());
        Point point = new Point(1,3);
        System.out.println("point.getName() = " + point.getName());
        Shape rectabgle = new Rectangle();
        System.out.println("rectabgle.getName() = " + rectabgle.getName());
    }
}
