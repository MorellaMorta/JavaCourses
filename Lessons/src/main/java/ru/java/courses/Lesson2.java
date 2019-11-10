package ru.java.courses;

class Lesson2 {

    public static void main(String[] args) {
     int x = 2;
     Double formula = Math.sqrt(13 * x + 13 / x);
     System.out.println(formula.intValue());
    }


    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     */
    //static formula(int x) {return 0}
}

