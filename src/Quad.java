class Quad extends Shape {        // також новий клас але метод реалізований трішки інакше
    private String name;  // оголошуємо змінну

    public Quad(String name) {   // конструктор для класу для передачі змінної
        this.name = name;
    }
    public String getName() {
        return name;
    } // метод що виводить змінну
}
