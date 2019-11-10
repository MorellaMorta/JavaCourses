package ru.java.courses;

/* import java.util.Arrays;*/

class Lesson2b {

    public static void main(String[] args) {
     String fullName = "Авдеева Ольга Владимировна";
        String[] Mass = fullName.split(" ");
        String initials = Mass[0].charAt(0) + "." + Mass[1].charAt(0) + "." + Mass[2].charAt(0) + ".";
        System.out.println(initials.toUpperCase());
    }
}

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
  /*  static String initials(String fullName) {
        return null;
    }
}*/


