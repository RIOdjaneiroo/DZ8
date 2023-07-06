abstract class Shape {                 // це наш абстрактний батьківський клас
    public abstract String getName();   // тут абстрактний метод що має перевизначатися в дочірніх класах
}
class Point extends Shape {           // клас точка, взагалі сказали так не робити але не стримався)
    private double x, y;             // 2 дабл змінні
    public Point(double x, double y) {this.x = x; this.y = y;}     // Когструктор
    public double getX() {return x;}            // геттер1
    public double getY() {return y;}            // геттер2
    public String getName() {return getClass().getSimpleName();} // перевизначений батьківський метод
}
class Circle extends Shape {      // новий клас Коло
    public String getName() {return getClass().getSimpleName();} //метод що виводить назву класу
}
class Quad extends Shape {        // також новий клас але метод реалізований трішки інакше
    private String name;  // оголошуємо змінну

    public Quad(String name) {   // конструктор для класу для передачі змінної
        this.name = name;
    }
    public String getName() {
        return name;
    } // метод що виводить змінну
}
class Triangle extends Shape {
    public String getName() {
        return getClass().getSimpleName();
    }
}
class Rectangle extends Shape {
    public String getName() {
        return getClass().getSimpleName();
    }
}
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
