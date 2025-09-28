package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // исправьте код так, что бы на экран выводилось что-то вроде.
        // Я Misty. Я прыгаю!
        // Я Tibbles. Я сплю!
        // Я Ginger. Я кушаю!
        // для решения примените лямбда-выражения, 
        
        // каждый кот должен уметь выполнять что-то своё
        var cats = new ArrayList<ActiveCat>();
        cats.add(new ActiveCat(ActiveCat::jump));
        cats.add(new ActiveCat(ActiveCat::sleep));
        cats.add(new ActiveCat(ActiveCat::eat));

        cats.add(new ActiveCat(ActiveCat::play));
        cats.add(new ActiveCat(ActiveCat::hunt));
        cats.add(new ActiveCat(ActiveCat::mur));

        cats.add(new ActiveCat(() -> "Я отдыхаю!"));
        cats.add(new ActiveCat(() -> "Я нюхаю мяту!"));
        cats.add(new ActiveCat(() -> "Я смотрю на мышь!"));
        // добавьте ещё два-три кота, с совершенно другими действиями

        cats.forEach(ActiveCat::doAction);
    }

}
