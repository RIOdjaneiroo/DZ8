class Point extends Shape {           // клас точка, взагалі сказали так не робити але не стримався)
    private double x, y;             // 2 дабл змінні
    public Point(double x, double y) {this.x = x; this.y = y;}     // Когструктор
    public double getX() {return x;}            // геттер1
    public double getY() {return y;}            // геттер2
    public String getName() {return getClass().getSimpleName();} // перевизначений батьківський метод
}
