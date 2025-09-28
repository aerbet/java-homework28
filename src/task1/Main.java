package task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        System.out.println("================ Original list ================");
        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("=============== Sorted by breed ===============");
        cats.sort(Cat::byBreed);
        Printer.print(cats);

        System.out.println("============ Sorted by name and age ===========");
        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        Printer.print(cats);

        System.out.println("================ Removed color ================");
        cats.removeIf(cat -> cat.isColor(Cat.Color.TABBY));
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        // cats.sort(?);
        // Printer.print(cats);
    }

}
